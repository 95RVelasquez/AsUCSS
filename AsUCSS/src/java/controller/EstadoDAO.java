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
import model.Estado;

/**
 *
 * @author Rony VC
 */
public class EstadoDAO implements MetodosDAO_AsesoriasUCSS{
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
    public List<Estado> getRegistros_de_BD() {
      List<Estado> estados=new ArrayList();
      Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from estado";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPass());
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {
                estados.add(new Estado(rs.getString("estado_id"),
                         rs.getString("tipoestado"),
                         rs.getString("horario"),
                         rs.getString("fecha"),
                         rs.getString("observacion")));
                
            }
            con.close();
            
        } catch (Exception e) {
        }
        return estados;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
