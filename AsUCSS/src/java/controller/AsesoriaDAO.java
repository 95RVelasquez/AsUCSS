/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Asesoria;

/**
 *
 * @author Rony VC
 */
public class AsesoriaDAO implements MetodosDAO_AsesoriasUCSS{
   Conexion c=new Conexion();
    @Override
    public String Agregar_a_BD(Object obj) {
      Connection con;
      Asesoria as=(Asesoria) obj;
      String respuesta="";
      PreparedStatement pst;
      String sql="Insert into asesoria values (?,?,?,?,?,?,?,?,?)";
        try
        {
         Class.forName(c.getDriver());
         con=DriverManager.getConnection(c.getUrl(),c.getUser(), c.getPass());
         pst=con.prepareStatement(sql);
         pst.setString(1, as.getAsesoria_id());
         pst.setString(2, as.getCurso());
         pst.setString(3, as.getDescripcion());
         pst.setString(4, as.getAdmin_id());
         pst.setString(5, as.getAula_id());
         pst.setString(6, as.getDocente_id());
         pst.setString(7, as.getFechainicio());
         pst.setString(8, as.getFechafin());
         pst.setString(9, as.getEstado());
         int rows=pst.executeUpdate();
         respuesta="Info :"+rows+"Alteradas";
         con.close();
        } catch (Exception e) {
        }
      return respuesta;
      
      
    }

    @Override
    public String Eliminar_de_BD(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Actulizar_en_BD(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asesoria> getRegistros_de_BD() {
        List<Asesoria> asesorias=new ArrayList();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from asesoria";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {
                asesorias.add(new Asesoria(rs.getString("asesoria_id"),
                        rs.getString("curso"), 
                        rs.getString("descripcion"), 
                        rs.getString("admin_id"), 
                        rs.getString("aula_id"), 
                        rs.getString("docente_id"), 
                        rs.getString("fechainicio"), 
                        rs.getString("fechafin"), 
                        rs.getString("estado")));
                
            }
        } catch (Exception e) {
        }
        return asesorias;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
