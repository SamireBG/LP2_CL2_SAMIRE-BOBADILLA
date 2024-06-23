<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/transparente.css">
    <title>Registrar Usuario</title>
</head>
<body>
    <div class="contenedor">
    	<!-- Intento de Video -->
        <video autoplay muted loop class="video-fondo">
            <source src="videos/portal.mp4" type="video/mp4">
        </video>
        <div class="container-page" id="Container">
            <div class="login-container" id="LoginContainer">
            <h1 class="title">CREA TU CUENTA</h1>
                <form action="ControladorUsuario" method="post">
                    <div class="input-line-container">
                        <span class="name-input">Usuario</span>
                        <input type="text" name="usuario" class="input-line" required>
                    </div>
                    <div class="input-line-container">
                        <span class="name-input">Contraseņa</span>
                        <input type="password" name="contraseņa" class="input-line" required>
                    </div>
                    <button class="button-login" type="submit" value="Registrar Usuario">REGISTRAR</button>
                    <button class="button-second" onclick="window.location.href = 'login.jsp';">TENGO CUENTA</button>
                </form>
            </div>
        </div>
    </div>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="code.js"></script>
</body>
</html>
