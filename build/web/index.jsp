<%-- 
    Document   : index
    Created on : 9/11/2022, 05:45:13 PM
    Author     : joset
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
    <div class="div">
        <form action="Controlador" method="post" class="form">

            <p>Ingrese su Usuario</p>
            <input type="text" name="txtusuario" value="" required="">
            <p>Ingrese su Contraseña</p>
            <input type="password" name="txtpass" value="" class="con" required="">

            <input type="submit" name="accion" value="Ingresar" class="botonn">
        </form>

    </div>
    
</body>
</html>
