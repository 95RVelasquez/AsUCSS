package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Sede;
import controller.SedeDAO;
import model.Estado;
import controller.EstadoDAO;
import model.Aula;
import controller.AulaDAO;
import model.Docente;
import controller.DocenteDAO;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import model.Administrador;
import controller.AdministradorDao;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import controller.AlumnoDAO;

public final class asesoria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"materialize/css/materialize.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("     </head>\n");
      out.write("   ");
 
       AdministradorDao ADAO=new AdministradorDao();
       List<Administrador> info=new ArrayList();
       AlumnoDAO ALDAO=new AlumnoDAO();
       List<Alumno> alinfo=new ArrayList();
       DocenteDAO DDAO=new DocenteDAO();
       List<Docente> docinfo=new ArrayList();
       AulaDAO AULADAO=new AulaDAO();
       List<Aula> infoaula=new ArrayList();
       EstadoDAO ESTADODAO=new EstadoDAO();
       List<Estado> infoestado=new ArrayList();
       SedeDAO SEDEDAO=new SedeDAO();
       List<Sede> infosede=new ArrayList();
    
      out.write("\n");
      out.write("    <body id=\"bodylogin\"class=\"registroasesorias\"> \n");
      out.write("        \n");
      out.write("<nav class=\"navbar navbar-default navbar-general\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"../index.jsp\"><img class=\"img-responsive\" src=\"img/logo-rony.png\" alt=\"\" style=\"height: 50px; margin-top:-7px;\"/></a>\n");
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
      out.write("\n");
      out.write("         \n");
      out.write("<!--**********************************-->\n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("<form role=\"form\" method=\"POST\">\n");
      out.write(" <div class=\"form-group controles-asesorias\">\n");
      out.write("     <div>\n");
      out.write("     ");

       docinfo=DDAO.getRegistros_de_BD();
       Docente d=new Docente();
     
      out.write("\n");
      out.write("     <input type=\"text\" class=\"form-control\" id=\"\" placeholder=\"Curso\">\n");
      out.write("     <input type=\"text\" class=\"form-control\" id=\"\" placeholder=\"Descripción\">\n");
      out.write("     <input type=\"text\" class=\"form-control\" id=\"\" placeholder=\"Confirma tu usuario\">\n");
      out.write("     </div>\n");
      out.write("     <div class=\"controles-cbx\">\n");
      out.write("            <div>\n");
      out.write("           \n");
      out.write("           <select class=\"form-control\" id=\"facultad\" name=\"facultad\">\n");
      out.write("           ");
 
              info=ADAO.getRegistros_de_BD();
              for(Administrador a:info)
              {
           
      out.write("\n");
      out.write("           <option value=\"");
      out.print( a.getAdmin_id());
      out.write('"');
      out.write('>');
      out.print( a.getNombre());
      out.write("</option>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("           </select>\n");
      out.write("           <label for=\"\">Administrador</label>\n");
      out.write("            <select class=\"form-control\" id=\"facultad\" name=\"facultad\">\n");
      out.write("            ");

              infoaula=AULADAO.getRegistros_de_BD();
              for(Aula aula:infoaula)
              {
            
      out.write("\n");
      out.write("            <option value=\"");
      out.print(aula.getAula_id());
      out.write('"');
      out.write('>');
      out.print(aula.getSalon());
      out.write("</option>>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <label for=\"\">Aula</label>\n");
      out.write("          </div>\n");
      out.write("          <div>\n");
      out.write("           \n");
      out.write("           <input type=\"date\" class=\"form-control\" id=\"\" placeholder=\"Tema?\">\n");
      out.write("           <label for=\"\">Fecha Inicio</label>\n");
      out.write("           <input type=\"date\" class=\"form-control\" id=\"\" placeholder=\"Tema?\">\n");
      out.write("           <label for=\"\">Fecha Fin</label>\n");
      out.write("          </div>\n");
      out.write("     </div>\n");
      out.write("   <div style=\"display: flex;\">\n");
      out.write("   <label for=\"\" >Estado</label>\n");
      out.write("   <select style=\"margin-left:-65px;margin-top:35px; width:40%;margin-right: 30%;\" class=\"form-control\" id=\"estado\" name=\"estado\">\n");
      out.write("        ");
 
          infoestado=ESTADODAO.getRegistros_de_BD();
          for(Estado estado:infoestado)
          {
        
      out.write("\n");
      out.write("        <option value=\"");
      out.print(estado.getEstado_id());
      out.write('"');
      out.write('>');
      out.print(estado.getTipoestado());
      out.write("</option>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </select>\n");
      out.write("   <label for=\"\" >Sede</label>\n");
      out.write("   <select  class=\"form-control\" id=\"estado\" name=\"estado\">\n");
      out.write("        ");
 
          infosede=SEDEDAO.getRegistros_de_BD();
          for(Sede sede:infosede)
          {
        
      out.write("\n");
      out.write("        <option value=\"");
      out.print(sede.getSede_id());
      out.write('"');
      out.write('>');
      out.print(sede.getNombre());
      out.write("</option>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </select>\n");
      out.write("    <button style=\"margin: 15px; height: 70px; background-color: #D32F2F;\"type=\"submit\" class=\"btn btn-success\">CREAR MI ASESORIA</button>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    <button style=\"margin:15px; \"ype=\"submit\" class=\"btn btn-success\" onclick=\"window.location='docente.jsp'\">Regresar</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                             \n");
      out.write("      \n");
      out.write("<!--**********************************-->\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("          <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"materialize/js/materialize.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/js.js\" type=\"text/javascript\"></script>\n");
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
