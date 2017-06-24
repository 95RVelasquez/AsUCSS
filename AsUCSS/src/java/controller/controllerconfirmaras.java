/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Asesoria_has_alumno;
import model.Asesoria;
import model.Docente;
import model.Alumno;
/**
 *
 * @author Rony VC
 */
@WebServlet(name = "controllerconfirmaras", urlPatterns = {"/controllerconfirmaras"})
public class controllerconfirmaras extends HttpServlet {
 public static List<Asesoria> getAsesoria(String asid)
     {
        List<Asesoria> lista=new ArrayList();
      try
      {
         Conexion cn=new Conexion();
         Connection con;
         Class.forName(cn.getDriver());
         con=DriverManager.getConnection(cn.getUrl(),cn.getUser(), cn.getPass());
             try (Statement st = con.createStatement()) {
                 String sql="select * from asesoria where asesoria_id like '"+asid+"'";
             try (ResultSet rs = st.executeQuery(sql)) {
                 while (rs.next())
                 {
                     Asesoria ase = new Asesoria();
                     ase.setDocente_id(rs.getString("docente_id"));
                    
                     lista.add(ase);
                 }
             }
             }
         con.close();
      }
      catch (Exception e)
      {
      }
      return lista;           
     }
  /**********************************************************************/
  
   public static List<Alumno> getIdAlumno(String useralumno)
     {
        List<Alumno> lista=new ArrayList();
      try
      {
         Conexion cn=new Conexion();
         Connection con;
         Class.forName(cn.getDriver());
         con=DriverManager.getConnection(cn.getUrl(),cn.getUser(), cn.getPass());
             try (Statement st = con.createStatement()) {
                 String sql="select * from alumno where codigo like '"+useralumno+"'";
             try (ResultSet rs = st.executeQuery(sql)) {
                 while (rs.next())
                 {
                     Alumno alu = new Alumno();
                     alu.setAlumno_id(rs.getString("alumno_id"));
                     alu.setCodigo(rs.getString("codigo"));
                     lista.add(alu);
                 }
             }
             }
         con.close();
      }
      catch (Exception e)
      {
      }
      return lista;           
     }
  
  /*********************************************************************/
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Asesoria_has_alumno detalle=new Asesoria_has_alumno();
            asesoria_has_alumnoDAO DETALLEDAO=new asesoria_has_alumnoDAO();
            String respuesta="";
            RequestDispatcher rdetalle=null;
            
            try {
              if(request.getParameter("guardarmiasesoria") !=null)
                    {

                        String idase=request.getParameter("idasesoria");
                        detalle.setAsesoria_asesoria_id(idase);
                        String cal=request.getParameter("tetxtconfirma");
                        List<Alumno> al=getIdAlumno(cal);
                        detalle.setAlumno_alumno_id(al.get(0).getAlumno_id());
                       respuesta=DETALLEDAO.Agregar_a_BD(detalle);
                       request.setAttribute("Respuesta", respuesta);
                    }  
                     rdetalle=request.getRequestDispatcher("./index.jsp");
                
            } catch (Exception e) {
            }
           rdetalle.forward(request, response); 

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
