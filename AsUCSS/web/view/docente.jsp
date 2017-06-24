<%-- 
    Document   : login
    Created on : 04-jun-2017, 14:26:25
    Author     : Rony VC
--%>

<%@page import="model.Asesoria"%>
<%@page import="controller.AsesoriaDAO"%>
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
        <title>Docente-AsUCSS</title>
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
       AsesoriaDAO ASDAO=new AsesoriaDAO();
       List<Asesoria> asinfo=new ArrayList();
    %>
     <body id="bodylogin"> 
        
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
             <li class=""><a id="option" href="#"><span class="fa fa-bell"></span></a></li>
          <li class=""><a id="option" href="#"><span class="fa fa-facebook"></span></a></li>
           <li class=""><a id="option" href="#"><span class="fa fa-twitter"></span></a></li>
            <li class=""><a id="option" href="#"><span class="fa fa-github"></span></a></li>
           <li class=""><a id="option" href="#"><span class="fa fa-google-plus"></span></a></li>
           
            <li class=""><a id="option" href="#"><span class="fa fa-gears"></span></a></li>
         </ul>
     </div>
  </div>
</nav>
<div class="container-principal">
    <div class="container-izq">
        <div class="administracion-panel">
            <a class="btn btn-primary" href="asesoria.jsp"><span class="fa fa-send"></span> Crear Asesoría</a>
            <a class="btn btn-primary" href=""><span class="fa fa-refresh"></span> En Proceso</a>
            <a class="btn btn-primary"href=""><span class="fa fa-check-square"></span> Finalizadas</a>
             <a class="btn btn-primary" href=""><span class="fa fa-commenting"></span> Dudas de Alumnos</a>
            <a class="btn btn-primary"href=""><span class="fa fa-table"></span> Notas</a>
        </div>   
      
        <div class="todas-panel">
            <!--AQUI CARRUSEL SE CARGARAN TODAS LAS ASESORIAS TANTO PARA ALUMNOS Y DOCENTES-->
            <div class="carousel fade-carousel slide carousel-fade" data-ride="carousel" data-interval="4000" id="bs-carousel">
                 
                  <ol class="carousel-indicators">
                    <li data-target="#bs-carousel" data-slide-to="0" class="active"></li>
                    <li data-target="#bs-carousel" data-slide-to="1"></li>
                    <li data-target="#bs-carousel" data-slide-to="2"></li>
                  </ol>
                <!-- Wrapper for slides -->
               
                 <div class="carousel-inner">
                   <%
                    asinfo=ASDAO.getRegistros_de_BD();
                    int i=0;
                    for(Asesoria as:asinfo)
                    {
                     i++;
                              
                               String slider="slide-"+i;
                               String n="class=";
                               String activo="active";
                   %>  
                   <div class="item slides <%if(i==1){out.println(activo);}%>">
                       <div <%out.println(n+'"'+slider+'"');%>>
                         <div class="overlay"></div>
                     </div>
                     <div class="hero">
                       <hgroup>
                           <h1><%=as.getCurso()%></h1>
                           <h3><%=as.getDescripcion()%></h3>
                       </hgroup>
                       <button class="btn btn-hero btn-lg" role="button">VER ASESORIA</button>
                     </div>
                   </div>
                     <%}
                           %>
                     
                     
                     
<!--                   <div class="item slides">
                     <div class="slide-2">
                         <div class="overlay"></div>
                     </div>
                     <div class="hero">        
                       <hgroup>
                           <h1>We are smart</h1>        
                           <h3>Get start your next awesome project</h3>
                       </hgroup>       
                       <button class="btn btn-hero btn-lg" role="button">See all features</button>
                     </div>
                   </div>
                   <div class="item slides">
                     <div class="slide-3">
                         <div class="overlay"></div>
                     </div>
                     <div class="hero">        
                       <hgroup>
                           <h1>We are amazing</h1>        
                           <h3>Get start your next awesome project</h3>
                       </hgroup>
                       <button class="btn btn-hero btn-lg" role="button">See all features</button>
                     </div>
                   </div>-->
                 </div> 
               </div>
        </div>
        
      <div class="discusiones-panel">
            <fieldset class="scheduler-border">
                <legend class="scheduler-border">Ultimas Discusiones</legend>
            </fieldset>
            
        </div> 
   </div>      
    <div class="container-der " id="style-1">
       <!--Aqui se cargan los alumnos y admins-->
    
        <div clas="admins">
           <h5 class="title-users">Alumnos</h5>
            <% 
            
            alinfo=ALDAO.getRegistros_de_BD();
            for(Alumno al:alinfo)
            {
            %>
            <div class="admin">
                <div class="foto-user"><img class="img-responsive" src="img/perfiles/1.jpg" alt=""/></div>
                <div>
                <h4><span class="fa fa-user-circle-o"></span>&nbsp;&nbsp;<%=al.getNombre()%> <%=al.getApellido()%></h4>
                <h4><span class="fa fa-graduation-cap"></span>&nbsp;&nbsp;<%=al.getCarrera()%></h4>
                <h4 style="color: #292929;"><span class="fa fa-flag-checkered"></span>&nbsp;&nbsp;Alumno</h4>
                </div>
             </div>              
             <%
               }
            %>
       </div>
        <div clas="admins">
           <h5 class="title-users">Profesores</h5>
            <% 
           
            docinfo=DDAO.getRegistros_de_BD();
            for(Docente doc:docinfo)
            {
            %>
            <div class="admin">
                <div class="foto-user"><img src="img/perfiles/1.jpg" alt=""/></div>
                <div>
                <h4><span class="fa fa-user-circle-o"></span>&nbsp;&nbsp; <%=doc.getNombre()%> <%=doc.getApellido()%></h4>
                <h4><span class="fa fa-envelope-o"></span>&nbsp;&nbsp; <a href="" ><%=doc.getCorreo()%></a></h4>
                <h4><span class="fa fa-rocket"></span>&nbsp;&nbsp; <%=doc.getEspecialidad() %></h4>
                </div>
            </div>              
             <%
               }
            %>
       </div>
           <div clas="admins">
           <h5 class="title-users">Administradores</h5>
            <% 
            info=ADAO.getRegistros_de_BD();
            for(Administrador a:info)
            {
            %>
            <div class="admin">
                <div class="foto-user"><img src="img/perfiles/1.jpg" alt=""/></div>
                <div>
                <h4><span class="fa fa-user-circle-o"></span>&nbsp;&nbsp;<%=a.getNombre()%> <%=a.getApellido()%></h4>
                <h4><span class="fa fa-envelope-o"></span>&nbsp;&nbsp;<a href="" ><%=a.getMail()%></a></h4>
                <h4><span class="fa fa-phone-square"></span>&nbsp;&nbsp; <%=a.getTelefono()%></h4>
                </div>
             </div>              
             <%
               }
            %>
       </div>
    </div>      
             
             
</div>       
         
         
         
         
         
         
<!--**********************************-->

                             
      
<!--**********************************-->

    <footer>
          <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="materialize/js/materialize.min.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </footer>
</body>
</html>
