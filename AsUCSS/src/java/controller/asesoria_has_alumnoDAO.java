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
import java.util.List;
import model.Asesoria_has_alumno;

/**
 *
 * @author Rony VC
 */
public class asesoria_has_alumnoDAO implements MetodosDAO_AsesoriasUCSS{
  Conexion c=new Conexion();
    @Override
    public String Agregar_a_BD(Object obj) {
        Connection con;
        Asesoria_has_alumno detalle=(Asesoria_has_alumno) obj;
        String rpt="";
        PreparedStatement pst;
        String sql="Insert into asesoria_has_alumno values (?,?)";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPass());
            pst=con.prepareStatement(sql);
            pst.setString(1,detalle.getAsesoria_asesoria_id());
            pst.setString(2,detalle.getAlumno_alumno_id());
            int filas=pst.executeUpdate();
            rpt="Info : "+filas+"Registradas";
            con.close();
        } catch (Exception e) {
        }
        return  rpt;
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
    public List<?> getRegistros_de_BD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
