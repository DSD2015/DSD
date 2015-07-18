<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script>


function validar(){
	
	var usuario  = document.inicio.usuario.value;
	var clave    = document.inicio.clave.value;
	
	
	var urll = document.URL;
	
	
	if(usuario != ""){
	
		if(clave != ""){
	
	
					if(usuario == "cliente" && clave == "cliente"){
					
					   		location.href= "http://localhost:8081/ClienteWeb/menu2.jsp";
					   			//urll+"menu2.jsp"; //"http://localhost:8081/proyecto.DSD/menu2.jsp";
					   		alert("Ingreso satisfactoriamente");
					
					}else if(usuario == "trabajador" && clave == "trabajador"){
					
						location.href= "http://localhost:8081/ClienteWeb/menu.jsp";
							//location.href=urll+"menu.jsp";
							
							//alert("entro al trabajador");
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
<body style="background:#999999">


<form  name="inicio"  method="post" >


<br><br><br><br><br>


<table  align="center" border="1" >


<tr>

<td>Usuario</td>

<td> <input  type="text"  name="usuario"  value="" >	</td>

</tr>

<tr>

<td>Clave</td>

<td> <input  type="password"  name="clave" value="" >  </td>

</tr>



<tr>

<td>  <td>  <a  href="#"  onclick="javascript:validar();"   >Ingresar</a>  </td>   </td>

</tr>


</table>


</form>

</body>
</html>