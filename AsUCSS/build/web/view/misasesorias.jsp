<%-- 
    Document   : login
    Created on : 04-jun-2017, 14:26:25
    Author     : Rony VC
--%>

<%@page import="model.Sede"%>
<%@page import="controller.SedeDAO"%>
<%@page import="model.Estado"%>
<%@page import="controller.EstadoDAO"%>
<%@page import="model.Aula"%>
<%@page import="controller.AulaDAO"%>
<%@page import="model.Docente"%>
<%@page import="controller.DocenteDAO"%>
<%@page import="com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList"%>
<%@page import="model.Administrador"%>
<%@page import="controller.AdministradorDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Alumno"%>

<%@page import="controller.AlumnoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis Asesorias-AsUCSS</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
     </head>
   <% 
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
    %>
    <body id="bodylogin"class="registroasesorias"> 
        
<nav class="navbar navbar-default navbar-general">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" href="../index.jsp"><img class="img-responsive" src="img/logo-rony.png" alt="" style="height: 50px; margin-top:-7px;"/></a>
    </div>
     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
         <ul class="nav navbar-nav navbar-right">
          <li class=""><a id="option" href="#"><span class="fa fa-user-circle"></span> Rony Velásquez</a></li>
          
          
         </ul>
     </div>
  </div>
</nav>

         
<!--**********************************-->
<div class="container">
    
  <form role="form" method="POST" action="../controllerasesorias">
  <div class="form-group controles-asesorias">
   
   
    <button style="margin: 15px; height: 70px; background-color: #D32F2F;"type="submit" name="registrarasesoria" class="btn btn-success">Mostrar todas</button>
   </div>
  


</form>
    <button style="margin:15px; "ype="submit" class="btn btn-success" onclick="window.location='alumno.jsp'">Regresar</button>
</div>


                             
      
<!--**********************************-->

    <footer>
          <script src="jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="materialize/js/materialize.min.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </footer>
</body>
</html>
