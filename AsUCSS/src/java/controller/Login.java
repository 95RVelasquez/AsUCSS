
package controller;

import Config.SeguridadWeb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Alumno;
import model.Docente;

/**
 *
 * @author Rony VC
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
        
         String tipoperfil=request.getParameter("tipoperfil");
         String user=request.getParameter("txtuser");
         String pass=request.getParameter("txtpass");
            if (null != tipoperfil) switch (tipoperfil) {
                case "Alumno":
                    String sql="select * from alumno where codigo like '"+user+"' and contrasena like '"+pass+"'";
                    Object[] row=SeguridadWeb.getFila(sql);
                    if(row !=null)
                    {
                        Alumno a=new Alumno();
                        a.setAlumno_id(row[0].toString());
                        a.setCodigo(row[1].toString());
                        a.setContrasena(row[5].toString());
                        
                       
                           request.getSession().setAttribute("a", a);
                           response.sendRedirect("view/alumno.jsp");
                        
                        
                    }else{
                        request.getSession().setAttribute("msg","Acceso no permitido");
                        response.sendRedirect("./index.jsp");
                    }      
                  break;
                case "Docente":
                    String sql2="select * from docente where user like '"+user+"' and contrasena like '"+pass+"'";
                    Object[] row2=SeguridadWeb.getFila(sql2);
                    if(row2 !=null)
                    {
                        Docente d=new Docente();
                        d.setDocente_id(row2[0].toString());
                        d.setUser(row2[5].toString());
                        d.setContrasena(row2[6].toString());
                        request.getSession().setAttribute("d", d);
                        response.sendRedirect("view/docente.jsp");
                    }else{
                        request.getSession().setAttribute("msg","Acceso no permitido");
                        response.sendRedirect("./index.jsp");
                    } 
                break;
            }
            
         
      
       
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
