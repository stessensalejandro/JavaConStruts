<%-- 
    Document   : failure
    Created on : Dec 15, 2008, 4:12:46 AM
    Author     : Alejandro
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error en el usuario o contraseña!!!</title>
          <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Calificacion de Equipos</title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="css/estilos.css" />
        <link rel="stylesheet" type="text/css" href="css/fonts.css" />
        <link rel="shortcut icon" type="image/x-icon" href="css/favicon.png" />
        
       
    </head>
    <body>
         <html:link action="/volver" styleClass="volver">  <html:img styleId="volver" src="css/back.png"/> </html:link>
  
        <div style="color:red">
            <h1>Usuario  <bean:write name="LoginForm" property="userName" ></bean:write></h1>
            <h1>No existe!!! </h1>
        </div>
    </body>
</html>
