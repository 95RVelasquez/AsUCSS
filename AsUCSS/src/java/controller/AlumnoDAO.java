/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.Conexion;
import java.sql.*;
import java.util.*;
import model.Alumno;

/**
 *
 * @author Rony VC
 */
public class AlumnoDAO  implements MetodosDAO_AsesoriasUCSS{
   Conexion c=new Conexion();
    @Override
    public String Agregar_a_BD(Object obj) {
       Connection con;
       Alumno a=(Alumno) obj;
       String Respuesta="";
       PreparedStatement pst;
       String sql="Insert into alumno values(?,?,?,?,?,?,?,?,?)";
        try {
           Class.forName(c.getDriver());
           con=DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
           pst=con.prepareStatement(sql);
           pst.setString(1, a.getAlumno_id());
           pst.setString(2, a.getCodigo());
           pst.setString(3, a.getNombre());
           pst.setString(4, a.getApellido());
           pst.setString(5, a.getCorreo());
           pst.setString(6, a.getContrasena());
           pst.setString(7, a.getFacultad());
           pst.setString(8, a.getCarrera());
           pst.setString(9, a.getPreferencias());
           int rows=pst.executeUpdate();
           con.close();
           Respuesta="Info:"+rows+" Registros ingresados";
        } catch (Exception e) {
        }
        return Respuesta;
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
    public List<Alumno> getRegistros_de_BD() {
        List<Alumno> alumno=new ArrayList();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from alumno";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            //condiciones de registros
            while (rs.next())
            {
                alumno.add(new Alumno(rs.getString("alumno_id"),
                        rs.getString("codigo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"), 
                        rs.getString("correo"), 
                        rs.getString("contrasena"), 
                        rs.getString("facultad"),
                        rs.getString("carrera"),
                        rs.getString("preferencias")));
                
            }
            con.close();
        } catch (Exception e) {
        }
        return alumno;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
