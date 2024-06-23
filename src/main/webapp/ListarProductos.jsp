<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*"%>
    <%@page import="model.TblProductocl2"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Productos</title>
</head>

<body bgcolor="#c5dec9">

<h1 align="center">Lista de Productos Registrados en BD</h1>

<h2 align="center">
	<a href="RegistrarProducto.jsp" style="text-decoration:none; color:blue;">Registrar</a>
</h2>

	<table border="2" align="center">
	
		<tr>
			<td>Nombre</td>
			<td>P. Venta</td>
			<td>P. Compra</td>
			<td>Estado</td>
			<td>Descripcion</td>
		</tr>
	
	<%
	List<TblProductocl2> listadoproducto = (List<TblProductocl2>)request.getAttribute("listadoproducto");
	if(listadoproducto!=null){
		for(TblProductocl2 listar : listadoproducto){
			%>
			<tr>
				<td><%=listar.getNombrecl2()%></td>
				<td><%=listar.getPrecioventacl2()%></td>
				<td><%=listar.getPreciocompcl2()%></td>
				<td><%=listar.getEstadocl2()%></td>
				<td><%=listar.getDescripcl2()%></td>
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