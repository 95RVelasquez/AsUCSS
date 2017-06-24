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
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
     </head>
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
          <li class=""><a id="option" href="#modal1"><span class="fa fa-gears"></span> Soporte</a></li>
          
          
         </ul>
     </div>
  </div>
</nav>
<!--**********************************-->

<div id="container-login">
     <div class="modal-header" style="background-color: #006064;">
                 
                 <h4 style="text-align: center; color: #fff;"><img src="img/logo-rony.png" alt=""/></h4>
       </div>
   <div class="row">
       <form class="col s12" action="../Login" method="POST">
        <div class="form-group">
                   <select class="form-control" id="tipoperfil" name="tipoperfil" >
                        <option value="Alumno">Soy Alumno</option>
                        <option value="Docente">Soy Docente</option>
                       
                    </select>
        </div> 
     <div class="row">
        <div class="col s12">
            <span class="fa fa-user-o"></span>
          <div class="input-field inline">
              <input id="txtuser" name="txtuser" type="text" class="validate ">
              <label  class="label_login"for="email" data-error="wrong" data-success="">Usuario</label>
          </div>
        </div>
      </div>
        <div class="row">
        <div class="col s12">
           <span class="fa fa-key"></span>
          <div class="input-field inline">
              <input id="txtpass" name="txtpass" type="password" class="validate">
            <label for="email" data-error="wrong" data-success="">Contradeña</label>
          </div>
        </div>
      </div>
        <div class="row">
        <div class="col s12">
          <div class="input-field inline">
              <input id="IniciarSesion" name="IniciarSesion" type="submit" class="btn btn-success" value="Iniciar Sesión">
              <input id="ingresar" type="sumbmit" class="btn btn-success" value="Olvidé Contraseña">  
          </div>
        </div>
      </div>
    </form>
  </div>   
    
    
</div>




<!--**********************************-->

    <footer>
          <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="materialize/js/materialize.min.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </footer>
</body>
</html>
