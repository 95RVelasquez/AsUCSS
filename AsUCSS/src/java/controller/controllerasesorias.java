/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.Conexion;
import Config.GeneraID;
import Config.SeguridadWeb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Asesoria;
import model.Docente;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rony VC
 */
@WebServlet(name = "controllerasesorias", urlPatterns = {"/controllerasesorias"})
public class controllerasesorias extends HttpServlet {

 public static List<Docente> getinfo(String id)
     {
        List<Docente> lista=new ArrayList();
      try
      {
         Conexion cn=new Conexion();
         Connection con;
         Class.forName(cn.getDriver());
         con=DriverManager.getConnection(cn.getUrl(),cn.getUser(), cn.getPass());
             try (Statement st = con.createStatement()) {
                 String sql="select nombre from docente where docente_id like '"+id+"'";
             try (ResultSet rs = st.executeQuery(sql)) {
                 while (rs.next())
                 {
                     Docente doc = new Docente();
//                     doc.setDocente_id(rs.getString("docente_id"));
                     doc.setNombre(rs.getString("nombre"));
                     lista.add(doc);
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
    public static List<Docente> getId(String userdocente)
     {
        List<Docente> lista=new ArrayList();
      try
      {
         Conexion cn=new Conexion();
         Connection con;
         Class.forName(cn.getDriver());
         con=DriverManager.getConnection(cn.getUrl(),cn.getUser(), cn.getPass());
             try (Statement st = con.createStatement()) {
                 String sql="select * from docente where user like '"+userdocente+"'";
             try (ResultSet rs = st.executeQuery(sql)) {
                 while (rs.next())
                 {
                     Docente doc = new Docente();
                     doc.setDocente_id(rs.getString("docente_id"));
                     doc.setNombre(rs.getString("nombre"));
                     lista.add(doc);
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
              
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Asesoria asesoria=new Asesoria();
            AsesoriaDAO ASESORIADAO=new AsesoriaDAO();
            String respuesta="";
            RequestDispatcher rdas=null;
          try {
              //   String sql="select * from docente where user like '"+manager+"'";
                
            if(request.getParameter("registrarasesoria") !=null)
            {
                String codigoasesoria=GeneraID.generarIDAdmin("Select * from asesoria");
                asesoria.setAsesoria_id(codigoasesoria);
                asesoria.setCurso(request.getParameter("txtcurso"));
                asesoria.setDescripcion(request.getParameter("txtdesc"));
                asesoria.setAdmin_id(request.getParameter("adminasesoria"));
                asesoria.setAula_id(request.getParameter("aulaasesoria"));
                List<Docente> l =getId(request.getParameter("txtconfirmauser"));
//                out.println("<td>"+l.get(0).getDocente_id()+"</td>");
                asesoria.setDocente_id(l.get(0).getDocente_id());
                asesoria.setFechainicio(request.getParameter("fechainicio"));
                asesoria.setFechafin(request.getParameter("fechafin"));
                asesoria.setEstado(request.getParameter("estado"));
                respuesta=ASESORIADAO.Agregar_a_BD(asesoria);
            request.setAttribute("Respuesta", respuesta); 
            }
              rdas=request.getRequestDispatcher("./index.jsp");
           } catch (Exception e) {
           }
           rdas.forward(request, response);
            
            
            
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
