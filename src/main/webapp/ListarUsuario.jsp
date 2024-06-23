<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*"%>
    <%@page import="model.TblUsuariocl2"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Usuarios</title>
</head>
<body bgcolor="#c5dec9">

<h1 align="center">Lista de Usuarios Registrados en BD</h1>

<h2 align="center">
	<a href="RegistrarUsuario.jsp" style="text-decoration:none; color:blue;">Registrar</a>
</h2>

	<table border="2" align="center">
	
		<tr>
			<td>Código</td>
			<td>Nombre</td>
			<td>Contraseña</td>
		</tr>
	
	<%
	List<TblUsuariocl2> listadousuario = (List<TblUsuariocl2>)request.getAttribute("listadousuario");
	if(listadousuario!=null){
		for(TblUsuariocl2 listar : listadousuario){
			%>
			<tr>
				<td><%=listar.getIdusuario()%></td>
				<td><%=listar.getUsuariocl2()%></td>
				<td><%=listar.getPasswordcl2()%></td>
			</tr>
			<%
		}//fin del bucle for
		
		%>
		
		<%
	}//fin de la condicion
	
	
	
	
	
	%>
	
	
	
	</table>

</body>
</html>