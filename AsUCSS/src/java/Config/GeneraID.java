/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;
/**
 *
 * @author Rony VC
 */
public class GeneraID {
    
    public static String generarIDAdmin(String sql) 
    {
      String IDGenerado = null;
      String IDObtenido=null;     
      //creamos la conexion con la bd
         try{
            Connection cn=new Conexion().getConexion();
            if(cn==null){
                IDGenerado=null;
            }else{
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while(rs.next()){
                    IDObtenido=rs.getString(1);
                }
                String parInt=IDObtenido.substring(1);
                String parStr=IDObtenido.substring(0,2);
                String nueParInt=String.valueOf(Integer.parseInt(parInt)+1);
                while(nueParInt.length()<2){
                    nueParInt="0"+nueParInt;
                }
                IDGenerado=parStr+nueParInt;
            }
        }catch(SQLException e){
            IDGenerado=null;
        }
     
        return IDGenerado;
    }
}
