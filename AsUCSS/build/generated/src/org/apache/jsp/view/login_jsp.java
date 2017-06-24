package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <li class=\"\"><a id=\"option\" href=\"#modal1\"><span class=\"fa fa-gears\"></span> Soporte</a></li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("         </ul>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--**********************************-->\n");
      out.write("\n");
      out.write("<div id=\"style-1\">\n");
      out.write("     <div class=\"modal-header\" style=\"background-color: #006064;\">\n");
      out.write("                 \n");
      out.write("                 <h4 style=\"text-align: center; color: #fff;\"><img src=\"img/logo-rony.png\" alt=\"\"/></h4>\n");
      out.write("       </div>\n");
      out.write("   <div class=\"row\">\n");
      out.write("       <form class=\"col s12\" action=\"../Login\" method=\"get\">\n");
      out.write("     <div class=\"row\">\n");
      out.write("        <div class=\"col s12\">\n");
      out.write("            <span class=\"fa fa-user-o\"></span>\n");
      out.write("          <div class=\"input-field inline\">\n");
      out.write("              <input id=\"txtuser\" name=\"txtuser\" type=\"user\" class=\"validate \">\n");
      out.write("              <label  class=\"label_login\"for=\"email\" data-error=\"wrong\" data-success=\"right\">Usuario</label>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col s12\">\n");
      out.write("           <span class=\"fa fa-key\"></span>\n");
      out.write("          <div class=\"input-field inline\">\n");
      out.write("              <input id=\"txtpass\" name=\"txtpass\" type=\"password\" class=\"validate\">\n");
      out.write("            <label for=\"email\" data-error=\"wrong\" data-success=\"right\">Contradeña</label>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col s12\">\n");
      out.write("          <div class=\"input-field inline\">\n");
      out.write("              <input id=\"IniciarSesion\" name=\"IniciarSesion\" type=\"submit\" class=\"btn btn-success\" value=\"Iniciar Sesión\">\n");
      out.write("              <input id=\"ingresar\" type=\"sumbmit\" class=\"btn btn-success\" value=\"Olvidé Contraseña\">  \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
