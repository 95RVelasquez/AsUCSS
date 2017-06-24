package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Docente;
import controller.DocenteDAO;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import model.Administrador;
import controller.AdministradorDao;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import controller.AlumnoDAO;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login-AsUCSS</title>\n");
      out.write("        <link href=\"view/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"view/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"view/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"view/materialize/css/materialize.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("     </head>\n");
      out.write("   ");
 
       AdministradorDao ADAO=new AdministradorDao();
       List<Administrador> info=new ArrayList();
       AlumnoDAO ALDAO=new AlumnoDAO();
       List<Alumno> alinfo=new ArrayList();
       DocenteDAO DDAO=new DocenteDAO();
       List<Docente> docinfo=new ArrayList();
    
      out.write("\n");
      out.write("     <body id=\"bodylogin\"> \n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-default navbar-general\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"../index.jsp\"><img class=\"img-responsive\" src=\"view/img/logo-rony.png\" alt=\"\" style=\"height: 50px; margin-top:-7px;\"/></a>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("         <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-user-circle\"></span> Rony Velásquez</a></li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("         </ul>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"container-principal\">\n");
      out.write("    <div class=\"container-izq\"></div>      \n");
      out.write("    <div class=\"container-der \" id=\"style-1\">\n");
      out.write("       <!--Aqui se cargan los alumnos y admins-->\n");
      out.write("       <div clas=\"admins\">\n");
      out.write("           <h5 class=\"title-users\">Administradores</h5>\n");
      out.write("            ");
 
            info=ADAO.getRegistros_de_BD();
            for(Administrador a:info)
            {
            
      out.write("\n");
      out.write("            <div class=\"admin\">\n");
      out.write("                <div class=\"foto-user\"><img src=\"view/img/perfiles/1.jpg\" alt=\"\"/></div>\n");
      out.write("                <div>\n");
      out.write("                <h4><span class=\"fa fa-user-circle-o\"></span>   ");
      out.print(a.getNombre());
      out.write("</h4>\n");
      out.write("                <h4><span class=\"fa fa-envelope-o\"></span><a href=\"\" > ");
      out.print(a.getMail());
      out.write("</a></h4>\n");
      out.write("                <h4><span class=\"fa fa-phone-square\"></span> ");
      out.print(a.getTelefono());
      out.write("</h4>\n");
      out.write("                </div>\n");
      out.write("             </div>              \n");
      out.write("             ");

               }
            
      out.write("\n");
      out.write("       </div>\n");
      out.write("        <div clas=\"admins\">\n");
      out.write("           <h5 class=\"title-users\">Alumnos</h5>\n");
      out.write("            ");
 
            
            alinfo=ALDAO.getRegistros_de_BD();
            for(Alumno al:alinfo)
            {
            
      out.write("\n");
      out.write("            <div class=\"admin\">\n");
      out.write("                <div class=\"foto-user\"><img class=\"img-responsive\" src=\"view/img/perfiles/1.jpg\" alt=\"\"/></div>\n");
      out.write("                <div>\n");
      out.write("                <h4><span class=\"fa fa-user-circle-o\"></span>   ");
      out.print(al.getNombre());
      out.write("</h4>\n");
      out.write("                <h4><span class=\"fa fa-envelope-o\"></span><a href=\"\" > ");
      out.print(al.getCorreo());
      out.write("</a></h4>\n");
      out.write("                <h4><span class=\"fa fa-phone-square\"></span> ");
      out.print(al.getCarrera());
      out.write("</h4>\n");
      out.write("                </div>\n");
      out.write("             </div>              \n");
      out.write("             ");

               }
            
      out.write("\n");
      out.write("       </div>\n");
      out.write("        <div clas=\"admins\">\n");
      out.write("           <h5 class=\"title-users\">Profesores</h5>\n");
      out.write("            ");
 
           
            docinfo=DDAO.getRegistros_de_BD();
            for(Docente doc:docinfo)
            {
            
      out.write("\n");
      out.write("            <div class=\"admin\">\n");
      out.write("                <div class=\"foto-user\"><img src=\"view/img/perfiles/1.jpg\" alt=\"\"/></div>\n");
      out.write("                <div>\n");
      out.write("                <h4><span class=\"fa fa-user-circle-o\"></span>   ");
      out.print(doc.getNombre());
      out.write("</h4>\n");
      out.write("                <h4><span class=\"fa fa-envelope-o\"></span><a href=\"\" > ");
      out.print(doc.getCorreo());
      out.write("</a></h4>\n");
      out.write("                <h4><span class=\"fa fa-phone-square\"></span> ");
      out.print(doc.getEspecialidad() );
      out.write("</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>              \n");
      out.write("             ");

               }
            
      out.write("\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("    </div>      \n");
      out.write("             \n");
      out.write("             \n");
      out.write("</div>       \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("<!--**********************************-->\n");
      out.write("\n");
      out.write("                             \n");
      out.write("      \n");
      out.write("<!--**********************************-->\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("          <script src=\"view/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"view/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"view/materialize/js/materialize.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"view/js/js.js\" type=\"text/javascript\"></script>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
