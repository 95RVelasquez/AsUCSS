/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Sede;

/**
 *
 * @author Rony VC
 */
public class SedeDAO implements MetodosDAO_AsesoriasUCSS{
 Conexion c=new Conexion();
    @Override
    public String Agregar_a_BD(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<Sede> getRegistros_de_BD() {
        List<Sede> sedes=new ArrayList();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from sede";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPass());
            pst=(PreparedStatement) con.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {
                sedes.add(new Sede(rs.getString("sede_id"),rs.getString("nombre")));
                
            }
            con.close();
        } catch (Exception e) {
        }
        return sedes;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
