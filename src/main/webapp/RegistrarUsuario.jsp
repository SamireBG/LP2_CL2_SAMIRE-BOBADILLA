<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Usuario</title>
</head>
<body bgcolor="#c5dec9">

<h1 align="center">Registrar Usuario</h1>

<form action="ControladorUsuario" method="post">

	<table border="2" align="center">
		<tr>
			<td>Usuario</td>
			<td><input type="text" name="usuario"></td>
		</tr>
		<tr>
			<td>Contrase�a</td>
			<td><input type="text" name="contrase�a"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="Registrar Usuario">
			</td>
		</tr>
		
	</table>

</form>
</body>
</html>