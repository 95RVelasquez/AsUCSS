package controller;

import Config.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Administrador;

/**
 *
 * @author Rony VC
 */
public class AdministradorDao implements MetodosDAO_AsesoriasUCSS{
   Conexion c=new Conexion();
    @Override
    public String Agregar_a_BD(Object obj) {
        Connection con;
        Administrador a=(Administrador) obj;
        String respuesta="";
        PreparedStatement pst;
        //Hacemos la consulta preparada
        String  sql="Insert into administrador values (?,?,?,?,?,?,?)";
        //capturamos excep.
        try {
            //creamos la conexion
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            pst=con.prepareStatement(sql);
            pst.setString(1,a.getAdmin_id());
            pst.setString(2,a.getNombre());
            pst.setString(3,a.getApellido());
            pst.setString(4,a.getMail());
            pst.setString(5,a.getTelefono());
            pst.setString(6,a.getUser());
            pst.setString(7,a.getContrasena());
            int row=pst.executeUpdate();
            con.close();
            respuesta="***"+row+"Ingresadas";
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
    public List<Administrador> getRegistros_de_BD() {
        List<Administrador> admins=new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="Select * from administrador";
        try {
            Class.forName(c.getDriver());
            con=DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            pst=con.prepareCall(sql);
            rs=pst.executeQuery();
            //condiciones de registros
            while (rs.next())
            {
                admins.add(new Administrador(rs.getString("admin_id"),rs.getString("nombre"), rs.getString("apellido"),rs.getString("mail"),rs.getString("telefono"),rs.getString("user"),rs.getString("contrasena")));
                
            }
            con.close();
        } catch (Exception e) {
        }
        return admins;
    }

    @Override
    public String getCancionFiltro(String CODCAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
