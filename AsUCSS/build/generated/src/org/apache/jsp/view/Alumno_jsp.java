package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.controllerconfirmaras;
import controller.controllerasesorias;
import model.Asesoria;
import controller.AsesoriaDAO;
import model.Docente;
import controller.DocenteDAO;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import model.Administrador;
import controller.AdministradorDao;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import controller.AlumnoDAO;

public final class alumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alumno-AsUCSS</title>\n");
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
       AsesoriaDAO ASDAO=new AsesoriaDAO();
       List<Asesoria> asinfo=new ArrayList();
    
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
      out.write("        <a class=\"navbar-brand\" href=\"../index.jsp\"><img class=\"img-responsive\" src=\"img/logo-rony.png\" alt=\"\" style=\"height: 50px; margin-top:-7px;\"/></a>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("         <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("             <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-bell\"></span></a></li>\n");
      out.write("          <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\n");
      out.write("           <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-twitter\"></span></a></li>\n");
      out.write("            <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-github\"></span></a></li>\n");
      out.write("           <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-google-plus\"></span></a></li>\n");
      out.write("           \n");
      out.write("            <li class=\"\"><a id=\"option\" href=\"#\"><span class=\"fa fa-gears\"></span></a></li>\n");
      out.write("         </ul>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"container-principal\">\n");
      out.write("    <div class=\"container-izq\">\n");
      out.write("        <div class=\"administracion-panel\">\n");
      out.write("            <a class=\"btn btn-primary\" href=\"\"><span class=\"fa fa-desktop\"></span> Mis Asesorías</a>\n");
      out.write("            <a class=\"btn btn-primary\" href=\"\"><span class=\"fa fa-refresh\"></span> EN Proceso</a>\n");
      out.write("            <a class=\"btn btn-primary\"href=\"\"><span class=\"fa fa-check-square\"></span> Finalizadas</a>\n");
      out.write("             <a class=\"btn btn-primary\" href=\"\"><span class=\"fa fa-table\"></span> Mis Notas</a>\n");
      out.write("            <a class=\"btn btn-primary\"href=\"\"><span class=\"fa fa-commenting\"></span> Discusiones</a>\n");
      out.write("        </div>   \n");
      out.write("       <div class=\"modal fade\" id=\"modalregistro\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("     <div class=\"modal-dialog\" id=\"style-1\">\n");
      out.write("         <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form role=\"form\" action=\"../controllerconfirmaras\" method=\"POST\">\n");
      out.write("                  <label for=\"\" class=\"alert-danger\">Confirma tu Asesoria</label>\n");
      out.write("                  <select class=\"form-control\" id=\"idasesoaria\" name=\"idasesoria\">\n");
      out.write("                   ");

                    asinfo=ASDAO.getRegistros_de_BD();
                    for(Asesoria as:asinfo)
                    {
                  
      out.write("\n");
      out.write("                      <option value=\"");
      out.print(as.getAsesoria_id());
      out.write('"');
      out.write('>');
      out.print(as.getCurso());
      out.write("</option>\n");
      out.write("                      ");

                      }
                  
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                  ");

                    String ida=request.getParameter("idasesoria");
                  
      out.write("\n");
      out.write("               <label for=\"\" class=\"alert-danger\">Administrador</label>\n");
      out.write("                  <select class=\"form-control\" id=\"idadasesoaria\" name=\"idadasesoaria\">\n");
      out.write("                   ");

                    info=ADAO.getRegistros_de_BD();
                    for(Administrador ad:info)
                    {
                  
      out.write("\n");
      out.write("                      <option value=\"");
      out.print(ad.getAdmin_id());
      out.write('"');
      out.write('>');
      out.print(ad.getNombre());
      out.write("</option>\n");
      out.write("                      ");

                      }
                  
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                 \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"\" class=\"alert-danger\">Aula</label>\n");
      out.write("                    <input type=\"text\"  name=\"aula\"class=\"form-control\" id=\"\" value=\"\"placeholder=\"  \">\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label for=\"\" class=\"alert-danger\">DOC</label>\n");
      out.write("                    <input type=\"text\"  name=\"DOC\"class=\"form-control\" id=\"\" value=\"\"placeholder=\"  \">\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"\" class=\"alert-danger\">Confirma User</label>\n");
      out.write("                    <input type=\"text\"  name=\"tetxtconfirma\"class=\"form-control\" id=\"\" placeholder=\"  \">\n");
      out.write("                  </div>\n");
      out.write("                 \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                 <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"submit\" name=\"guardarmiasesoria\"class=\"btn btn-success\">QUIERO UNIRME AHORA <span class=\"fa fa-check\"></span></button>\n");
      out.write("              <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"fa fa-close\"></span></button>\n");
      out.write("            </div>\n");
      out.write("               </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("        <div class=\"todas-panel\">\n");
      out.write("            <!--AQUI CARRUSEL SE CARGARAN TODAS LAS ASESORIAS TANTO PARA ALUMNOS Y DOCENTES-->\n");
      out.write("            <div class=\"carousel fade-carousel slide carousel-fade\" data-ride=\"carousel\" data-interval=\"4000\" id=\"bs-carousel\">\n");
      out.write("                 \n");
      out.write("                  <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#bs-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#bs-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#bs-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("                  </ol>\n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("               \n");
      out.write("                 <div class=\"carousel-inner\">\n");
      out.write("                   ");

                    asinfo=ASDAO.getRegistros_de_BD();
                    int i=0;
                    for(Asesoria as:asinfo)
                    {
                     i++;
                              
                               String slider="slide-"+i;
                               String n="class=";
                               String activo="active";
                   
      out.write("  \n");
      out.write("                   <div class=\"item slides ");
if(i==1){out.println(activo);}
      out.write("\">\n");
      out.write("                       <div ");
out.println(n+'"'+slider+'"');
      out.write(">\n");
      out.write("                         <div class=\"overlay\"></div>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"hero\">\n");
      out.write("                       <hgroup>\n");
      out.write("                           <h1>");
      out.print(as.getCurso());
      out.write("</h1>\n");
      out.write("                           <h3>");
      out.print(as.getDescripcion());
      out.write("</h3>\n");
      out.write("                           <h5 style=\"font-size: 15px;\">Inicio : ");
      out.print(as.getFechainicio());
      out.write(" | FIN : ");
      out.print(as.getFechafin());
      out.write("</h5>\n");
      out.write("                           <h5 style=\"font-size: 15px;\">");
      out.print(as.getEstado());
      out.write("</h5>\n");
      out.write("                       </hgroup>\n");
      out.write("                       <button class=\"btn btn-hero btn-lg\" role=\"button\" data-toggle=\"modal\" data-target=\"#modalregistro\">VER ASESORIA</button>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                     ");
}
                           
      out.write("\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("\n");
      out.write("                 </div> \n");
      out.write("               </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      <div class=\"discusiones-panel\">\n");
      out.write("            <fieldset class=\"scheduler-border\">\n");
      out.write("                <legend class=\"scheduler-border\">Ultimas Discusiones</legend>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("        </div> \n");
      out.write("   </div>      \n");
      out.write("    <div class=\"container-der \" id=\"style-1\">\n");
      out.write("       <!--Aqui se cargan los alumnos y admins-->\n");
      out.write("    \n");
      out.write("        <div clas=\"admins\">\n");
      out.write("           <h5 class=\"title-users\">Alumnos</h5>\n");
      out.write("            ");
 
            
            alinfo=ALDAO.getRegistros_de_BD();
            for(Alumno al:alinfo)
            {
            
      out.write("\n");
      out.write("            <div class=\"admin\">\n");
      out.write("                <div class=\"foto-user\"><img class=\"img-responsive\" src=\"img/perfiles/1.jpg\" alt=\"\"/></div>\n");
      out.write("                <div>\n");
      out.write("                <h4><span class=\"fa fa-user-circle-o\"></span>&nbsp;&nbsp;");
      out.print(al.getNombre());
      out.write(' ');
      out.print(al.getApellido());
      out.write("</h4>\n");
      out.write("                <h4><span class=\"fa fa-graduation-cap\"></span>&nbsp;&nbsp;");
      out.print(al.getCarrera());
      out.write("</h4>\n");
      out.write("                <h4 style=\"color: #292929;\"><span class=\"fa fa-flag-checkered\"></span>&nbsp;&nbsp;Alumno</h4>\n");
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
      out.write("                <div class=\"foto-user\"><img src=\"img/perfiles/1.jpg\" alt=\"\"/></div>\n");
      out.write("                <div>\n");
      out.write("                <h4><span class=\"fa fa-user-circle-o\"></span>&nbsp;&nbsp; ");
      out.print(doc.getNombre());
      out.write(' ');
      out.print(doc.getApellido());
      out.write("</h4>\n");
      out.write("                <h4><span class=\"fa fa-envelope-o\"></span>&nbsp;&nbsp; <a href=\"\" >");
      out.print(doc.getCorreo());
      out.write("</a></h4>\n");
      out.write("                <h4><span class=\"fa fa-rocket\"></span>&nbsp;&nbsp; ");
      out.print(doc.getEspecialidad() );
      out.write("</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>              \n");
      out.write("             ");

               }
            
      out.write("\n");
      out.write("       </div>\n");
      out.write("           <div clas=\"admins\">\n");
      out.write("           <h5 class=\"title-users\">Administradores</h5>\n");
      out.write("            ");
 
            info=ADAO.getRegistros_de_BD();
            for(Administrador a:info)
            {
            
      out.write("\n");
      out.write("            <div class=\"admin\">\n");
      out.write("                <div class=\"foto-user\"><img src=\"img/perfiles/1.jpg\" alt=\"\"/></div>\n");
      out.write("                <div>\n");
      out.write("                <h4><span class=\"fa fa-user-circle-o\"></span>&nbsp;&nbsp;");
      out.print(a.getNombre());
      out.write(' ');
      out.print(a.getApellido());
      out.write("</h4>\n");
      out.write("                <h4><span class=\"fa fa-envelope-o\"></span>&nbsp;&nbsp;<a href=\"\" >");
      out.print(a.getMail());
      out.write("</a></h4>\n");
      out.write("                <h4><span class=\"fa fa-phone-square\"></span>&nbsp;&nbsp; ");
      out.print(a.getTelefono());
      out.write("</h4>\n");
      out.write("                </div>\n");
      out.write("             </div>              \n");
      out.write("             ");

               }
            
      out.write("\n");
      out.write("       </div>\n");
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
      out.write("          <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
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
