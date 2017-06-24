/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.GeneraID;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alumno;
import model.Docente;

/**
 *
 * @author Rony VC
 */
@WebServlet(name = "controllerusuarios", urlPatterns = {"/controllerusuarios"})
public class controllerusuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            AlumnoDAO DAOALUMNO=new AlumnoDAO();
            DocenteDAO DAODOCENTE=new DocenteDAO();
            Alumno a=new Alumno();
            Docente d=new Docente();
            String Respuesta="";
            RequestDispatcher rdrony=null;
            try {
                  
                  String facu=request.getParameter("facultad");
                if (request.getParameter("guardar") !=null) {
                          String id=GeneraID.generarIDAdmin("Select * from alumno");
                            a.setAlumno_id(id);
                            a.setCodigo(request.getParameter("txtcod"));
                            a.setNombre(request.getParameter("txtnom"));
                            a.setApellido(request.getParameter("txtape"));
                            a.setCorreo(request.getParameter("txtmail"));
                            a.setContrasena(request.getParameter("txtpass"));
                            a.setFacultad(facu);
                            a.setCarrera(request.getParameter("txtcarrera"));
                            a.setPreferencias(request.getParameter("txtdes"));
                            Respuesta=DAOALUMNO.Agregar_a_BD(a);
                            request.setAttribute("Respuesta", Respuesta);
              
                }
                else if(request.getParameter("guardardoc") !=null)
                {
                           String id=GeneraID.generarIDAdmin("Select * from docente");
                            d.setDocente_id(id);
                            d.setNombre(request.getParameter("txtnomdoc"));
                            d.setApellido(request.getParameter("txtapedoc"));
                            d.setCorreo(request.getParameter("txtmaildoc"));
                            d.setEspecialidad(request.getParameter("txtespsdoc"));
                            d.setUser(request.getParameter("txtuserdoc"));
                            d.setContrasena(request.getParameter("textpassdoc"));
                            d.setWeb(request.getParameter("textwebdoc"));
                            d.setDescripcion(request.getParameter("txtdesdoc"));
                            d.setTipo(request.getParameter("texttipodoc"));
                            Respuesta=DAODOCENTE.Agregar_a_BD(d);
                            request.setAttribute("Respuesta", Respuesta);
                          
                }
                rdrony=request.getRequestDispatcher("./index.jsp");
                
            } catch (Exception e) {
            }
           
            rdrony.forward(request, response);
           
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
