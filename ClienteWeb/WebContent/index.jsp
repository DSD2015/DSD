<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quick Win</title>
    <%@include file="headfile.jsp" %>
    <script>
    function validar(){
        var usuario  = document.inicio.usuario.value,
            clave    = document.inicio.clave.value,
            urll = document.URL;

        if(usuario != ""){
            if(clave != ""){
                if(usuario == "cliente" && clave == "cliente"){
                    location.href= "http://localhost:8081/ClienteWeb/home2.jsp";
                        alert("Ingreso satisfactoriamente");
                }else if(usuario == "trabajador" && clave == "trabajador"){
                    location.href= "http://localhost:8081/ClienteWeb/home.jsp";
                    alert("Ingreso satisfactoriamente");

                }else{
                    alert("Usuario Incorrecto o Clave Incorrecta Porfavor revisar");
                }
            }else{
                alert("Ingrese una Clave");
            }
        }else{
            alert("Ingrese un Usuario");
        }
    }
    </script>
</head>
<body>
    <div class="dsd-login-container dsd">
        <div class="container container-login">
            <div class="row vertical-center-row">
                <div class="els-login-wrapper">
                    <form class="login-form"
                          name="inicio"
                          autocomplete="on"
                          action="javascript:validar();"
                          method="post">
                        <fieldset>
                            <input type="text"
                                   id="onevideo_login_username"
                                   name="usuario"
                                   placeholder="Username">
                            <input type="password"
                                   id="onevideo_login_password"
                                   name="clave"
                                   placeholder="Password">
                            <button type="submit"
                                    id="onevideo_login_submit"
                                    class="btn btn-primary">
                            <span>Sign In</span>
                            </button>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>