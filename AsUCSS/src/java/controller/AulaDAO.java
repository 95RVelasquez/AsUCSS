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
import model.Aula;

/**
 *
 * @author Rony VC
 */
public class AulaDAO implements MetodosDAO_AsesoriasUCSS{
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
    public List<Aula> getRegistros_de_BD() {
        List<Aula> aulas=new ArrayList();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from aula";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPass());
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {
               aulas.add(new Aula(rs.getString("aula_id"),
                       rs.getString("sede_id"),
                       rs.getString("salon"),
                       rs.getString("estado_id")));
                
            }
            con.close();
        } catch (Exception e) {
        }
        return aulas;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
