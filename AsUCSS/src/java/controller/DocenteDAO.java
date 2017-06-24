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
import model.Docente;

/**
 *
 * @author Rony VC
 */
public class DocenteDAO implements MetodosDAO_AsesoriasUCSS{
  Conexion c=new Conexion();
    @Override
    public String Agregar_a_BD(Object obj) {
        Connection con;
        Docente doc=(Docente) obj;
        String Respuesta="";
        PreparedStatement pst;
        String sql="Insert into docente values (?,?,?,?,?,?,?,?,?,?)";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(),c.getUser(), c.getPass());
            pst=con.prepareStatement(sql);
            pst.setString(1, doc.getDocente_id());
            pst.setString(2, doc.getNombre());
            pst.setString(3, doc.getApellido());
            pst.setString(4, doc.getCorreo());
            pst.setString(5, doc.getEspecialidad());
            pst.setString(6, doc.getUser());
            pst.setString(7, doc.getContrasena());
            pst.setString(8, doc.getWeb());
            pst.setString(9, doc.getDescripcion());
            pst.setString(10, doc.getTipo());
            int rows=pst.executeUpdate();
            con.close();
            Respuesta="Info :" +rows+" Registradas";
            
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
    public List<Docente> getRegistros_de_BD() {
        //Aqui obtenemos la lista de la bd
        List <Docente> docentes=new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from docente";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {
                docentes.add(new Docente(rs.getString("docente_id"),
                                         rs.getString("nombre"),
                                         rs.getString("apellido"),
                                         rs.getString("correo"),
                                         rs.getString("especialidad"),
                                         rs.getString("user"),
                                         rs.getString("contrasena"),
                                         rs.getString("web"),
                                         rs.getString("descripcion"),
                                         rs.getString("tipo")));
            }
            con.close();
        } catch (Exception e) {
        }
      return docentes;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
  
    
}
