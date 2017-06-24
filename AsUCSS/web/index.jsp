<%-- 
    Document   : login
    Created on : 04-jun-2017, 14:26:25
    Author     : Rony VC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login-AsUCSS</title>
        <link href="./view/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="./view/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="./view/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="./view/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
     </head>
<body>      
<nav class="navbar navbar-default navbar-ini">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" href="index.jsp"><img class="img-responsive" src="./view/img/logo-rony.png" alt="" style="height: 50px; margin-top:-7px;"/></a>
    </div>
     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
         <ul class="nav navbar-nav navbar-right">

             <li class=""><button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onclick="window.location='view/login.jsp'"><span class="fa fa-toggle-on"> Iniciar Sesión</span></button></li>
             <li class="perfil-registro">
               <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fa fa-graduation-cap"> Registrarme</span></button>
                    <div class="dropdown-menu dmenu" aria-labelledby="dropdownMenuButton">
                      <a class="dropdown-item" href="" data-toggle="modal" data-target="#modalregistro">Alumno</a>
                      <a class="dropdown-item" href=""data-toggle="modal" data-target="#modalregistrodoc">Profesor</a>
                    </div>
               </div>
             </li>
         </ul>
     </div>
  </div>
</nav>
<!--**********************************-->

<!--**********************************-->
<div class="slider fullscreen" style="z-index: 2;">
    <ul class="slides" id="slides">
        <li id="slide">
            <img src="./view/img/slides/i.png"> <!-- random image -->
        <div class="caption center-align">
            <h3 class="title1">APRENDE - OPINA - COMPARTE</h3>
            <h5 class="light grey-text text-lighten-3">La única plataforma en la <a href="">UCSS</a> para aprender!</h5>
        </div>
      </li>
      <li id="slide">
          <img src="./view/img/slides/2.jpg"> <!-- random image -->
        <div class="caption left-align">
            <h3 class="title2">Gran parte de la familia <a href="">ucss</a> ya forma parte de esta plataforma!! <span class="fa fa-hand-peace-o"></span></h3>
           
            <a href="" class="btn btn-success" data-toggle="modal" data-target="#modalregistro">Quiero ser parte</a>
        </div>
      </li>
      <li id="slide">
          <img src="./view/img/slides/5.jpg"> <!-- random image -->
        <div class="caption right-align">
         <h3 class="title3">Estás listo para aprender con nosotros?</h3>
         <h5 class="light grey-text text-lighten-3"><span class="fa fa-thumbs-up"></span> Recuerda es gratis! <span style="color:red;"class="fa fa-heart"></span></h5>
        </div>
      </li>
      <!--<li>
        <img src="http://lorempixel.com/580/250/nature/4"> <!-- random image 
        <div class="caption center-align">
          <h3>This is our big Tagline!</h3>
          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
        </div>
      </li>-->
    </ul>
  </div>

 <div class="modal fade" id="modalregistro" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
     <div class="modal-dialog" id="style-1">
         <div class="modal-content">
           
             <div class="modal-header" style="background-color: #000;">
                 
                 <h4 style="text-align: center; color: #fff; overflow: hidden;"><img src="./view/img/logo-rony.png" alt=""/></h4>
                 <h4 style="text-align: center; color: #fff; overflow: hidden;">**ALUMNOS**</h4>
            </div>
            <div class="modal-body">
                <form role="form" action="controllerusuarios" method="POST">
<!--           
                  <div class="form-group">
                      <label for="ejemplo_email_1" class="alert-warning">ID</label>
                    <input type="text" name="txtid"class="form-control" id=""
                           placeholder="">
                  </div>-->
                
                  <div class="form-group">
                      <label for="" class="alert-warning">Código UCSS</label>
                    <input type="text" name="txtcod"class="form-control" id=""
                           placeholder="  ">
                  </div>
                  <div class="form-group">
                    <label for="" class="alert-warning">Nombre</label>
                    <input type="text"  name="txtnom"class="form-control" id=""
                           placeholder="  ">
                  </div>
                  <div class="form-group">
                    <label for="" class="alert-warning">Apellidos</label>
                    <input type="text" name="txtape" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                     <div class="form-group">
                    <label for="" class="alert-warning">Mail</label>
                    <input type="text" name="txtmail" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                   
                 <div class="form-group">
                    <label for="" class="alert-warning">Contraseña</label>
                    <input type="password" name="txtpass" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                 <div class="form-group">
                    <label for="ejemplo_email_1" class="alert-warning">Facultad</label>
                   <select class="form-control" id="facultad" name="facultad">
                        <option value="Ingenieria">Ingeniería</option>
                        <option value="Ciencias">Ciencias</option>
                        <option value="Educacion">Educacion</option>
                    </select>
                  </div> 
                     <div class="form-group">
                    <label for="ejemplo_email_1" class="alert-warning">Carrera</label>
                    <input type="text" name="txtcarrera" class="form-control" id="ejemplo_email_1"
                           placeholder="  ">
                  </div> 
               <div class="form-group">
                    <label for="ejemplo_email_1" class="alert-warning">Descripción</label>
                    <input type="text" name="txtdes" class="form-control" id="ejemplo_email_1"
                           placeholder="  ">
                  </div> 
                 <div class="modal-footer">
                    <button type="submit" name="guardar"class="btn btn-success"><span class="fa fa-check"></span></button>
              <button type="button" class="btn btn-danger" data-dismiss="modal" aria-hidden="true"><span class="fa fa-close"></span></button>
            </div>
               </form>
            </div>
            
         </div>
      </div>
   </div>
  <div class="modal fade" id="modalregistrodoc" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
     <div class="modal-dialog" id="style-1">
         <div class="modal-content">
           
             <div class="modal-header" style="background-color: #000;">
                 
                 <h4 style="text-align: center; color: #fff; overflow: hidden;"><img src="./view/img/logo-rony.png" alt=""/></h4>
                 <h4 style="text-align: center; color: #fff; overflow: hidden;">**DOCENTES**</h4>
            </div>
            <div class="modal-body">
                <form role="form" action="controllerusuarios" method="POST">
           
<!--                  <div class="form-group">
                      <label for="" class="alert-warning">ID</label>
                    <input type="text" name="txtiddoc"class="form-control" id=""
                           placeholder="">
                  </div>
                -->
                  <div class="form-group">
                    <label for="" class="alert-warning">Nombre</label>
                    <input type="text"  name="txtnomdoc"class="form-control" id=""
                           placeholder="  ">
                  </div>
                  <div class="form-group">
                    <label for="" class="alert-warning">Apellidos</label>
                    <input type="text" name="txtapedoc" class="form-control" id=""
                           placeholder="  ">
                  </div>
                  <div class="form-group">
                    <label for="" class="alert-warning">Especialidad</label>
                    <input type="text" name="txtespsdoc" class="form-control" id="ejemplo_email_1"
                           placeholder="  ">
                  </div> 
                  <div class="form-group">
                    <label for="" class="alert-warning">Mail</label>
                    <input type="text" name="txtmaildoc" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                  <div class="form-group">
                    <label for="" class="alert-warning">Usuario</label>
                    <input type="text" name="txtuserdoc" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                     <div class="form-group">
                    <label for="" class="alert-warning">Cotraseña</label>
                    <input type="password" name="textpassdoc" class="form-control" id="ejemplo_email_1"
                           placeholder="  ">
                  </div>
                   <div class="form-group">
                    <label for="" class="alert-warning">Web</label>
                    <input type="text" name="textwebdoc" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                  <div class="form-group">
                    <label for="" class="alert-warning">Descripción</label>
                    <input type="text" name="txtdesdoc" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                  <div class="form-group">
                    <label for="" class="alert-warning">Tipo</label>
                    <input type="text" name="texttipodoc" class="form-control" id=""
                           placeholder="  ">
                  </div> 
                 <div class="modal-footer">
                    <button type="submit" name="guardardoc"class="btn btn-success"><span class="fa fa-check"></span></button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal" aria-hidden="true"><span class="fa fa-close"></span></button>
                 </div>
               </form>
            </div>
            
         </div>
      </div>
   </div>  
   

    <footer>
          <script src="./view/js/jquery.js" type="text/javascript"></script>
        <script src="./view/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="./view/materialize/js/materialize.min.js" type="text/javascript"></script>
        <script src="./view/js/js.js" type="text/javascript"></script>
    </footer>
 </body>
</html>