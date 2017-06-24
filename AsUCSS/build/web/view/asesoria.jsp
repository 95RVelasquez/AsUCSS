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
        <title>Login-AsUCSS</title>
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
     <div>
     <%
       docinfo=DDAO.getRegistros_de_BD();
       Docente d=new Docente();
     %>
     <input type="text" class="form-control" id="" name="txtcurso"placeholder="Curso">
     <input type="text" class="form-control" id="" name="txtdesc"placeholder="Descripción">
     <input type="text" class="form-control" id="" name="txtconfirmauser"placeholder="Confirma tu usuario">
     </div>
     <div class="controles-cbx">
            <div>
           
           <select class="form-control" id="adminasesoria" name="adminasesoria">
           <% 
              info=ADAO.getRegistros_de_BD();
              for(Administrador a:info)
              {
           %>
           <option value="<%= a.getAdmin_id()%>"><%= a.getNombre()%></option>
           <%}%>
           </select>
           <label for="">Administrador</label>
            <select class="form-control" id="aulaasesria" name="aulaasesoria">
            <%
              infoaula=AULADAO.getRegistros_de_BD();
              for(Aula aula:infoaula)
              {
            %>
            <option value="<%=aula.getAula_id()%>"><%=aula.getSalon()%></option>>
           <%}%>
            </select>
            <label for="">Aula</label>
          </div>
          <div>
           
              <input type="date" class="form-control" id="" name="fechainicio"placeholder="">
           <label for="">Fecha Inicio</label>
           <input type="date" class="form-control" id="" name="fechafin" placeholder="">
           <label for="">Fecha Fin</label>
          </div>
     </div>
   <div style="display: flex;">
   <label for="" >Sede</label>
   <select  class="form-control" id="" name="">
        <% 
          infosede=SEDEDAO.getRegistros_de_BD();
          for(Sede sede:infosede)
          {
        %>
        <option value="<%=sede.getSede_id()%>"><%=sede.getNombre()%></option>
        <% }%>
    </select>
   <label for="" >Estado</label>
   <select style="" class="form-control" id="estado" name="estado">
   nnnnn <option value="Iniciado">Iniciado</option>
        <option value="Iniciado">Finalizar</option>
    </select>
   
    <button style="margin: 15px; height: 70px; background-color: #D32F2F;"type="submit" name="registrarasesoria" class="btn btn-success">CREAR MI ASESORIA</button>
   </div>
   </div>


</form>
    <button style="margin:15px; "ype="submit" class="btn btn-success" onclick="window.location='docente.jsp'">Regresar</button>
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
