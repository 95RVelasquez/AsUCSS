
package Config;

import java.sql.*;
import java.util.*;


/**
 *
 * @author Rony VC
 */
public class SeguridadWeb {
    //Objeto de la clase conexion
    Conexion c=new Conexion();
   public   static String Run(String sql)
   {
       
       String mensaje="";
       try {
            Connection con=new Conexion().getConexion();
           if(con==null)
           {
               mensaje="Error al conectarse";
           }else{
               Statement st=con.createStatement();
               st.executeUpdate(sql);
               con.close();
           }
       } catch (Exception e) {
           mensaje=e.getMessage();
       }
       return mensaje;
   }
    
   public static List GetTabla(String sql)
   {
       List lista=new ArrayList(); 
     
       try {
           Connection con=new Conexion().getConexion();
            if(con==null)
            {
              lista=null;   
            }else
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                ResultSetMetaData rm=rs.getMetaData();
                int numcolumnas=rm.getColumnCount();
                String[] titulocolum=new String[numcolumnas];
                for (int i=0;i<numcolumnas;i++) 
                     titulocolum[i]=rm.getColumnName(i+1);
                lista.add(titulocolum);
                while(rs.next()){
                    Object[]fila=new Object[numcolumnas];
                    for(int i=0;i<numcolumnas;i++)
                        fila[i]=rs.getObject(i+1);
                    lista.add(fila);
                } 
                con.close();
            }
       } catch (Exception e) {
           lista=null;
       }
       return lista;
   }
   public static Object[] getFila(String sql){
        Object[]fila=null;
        List lista=GetTabla(sql);
        if(lista!=null){
            if(lista.size()>1)
                fila=(Object[])lista.get(1);
        }
        return fila;
    }
    public static Object getColumna(String sql) {
        Object[] fila = getFila(sql);
        Object columna = null;
        if (fila != null) {
            columna = fila[0];
        }
        return columna;
    }   
    
    
    
    
}
