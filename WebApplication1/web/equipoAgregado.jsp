<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%--<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
--%>


<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<html:html>
    <head>

        
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Calificacion de Equipos</title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="css/estilos.css" />
        <link rel="stylesheet" type="text/css" href="css/fonts.css" />
        <link rel="shortcut icon" type="image/x-icon" href="css/favicon.png" />
        
        <title>Calificacion de Equipos</title>
      
        
    </head>
  
    <html:link action="/volver" styleClass="volver">  <html:img styleId="volver" src="css/back.png"/> </html:link>
    <br> 
    <br>    
    <div class="header">
        Ingrese el nombre del equipo con su calificación de 0 a 5 para agregar.
    
    
    <div class="centrar">     
            <p>Calificacion de equipos</p>
        
            
       <html:form action="/agregar"> 
       
       Equipo: <html:text   property="name"  value=" " styleClass="caja"/>
       <html:errors property="name" />
       Puntos: <html:text   property="puntos" value="0" styleClass="caja"/>
        
       <html:submit value="+" styleClass="botonLogin" />
            
       </html:form>
       <br>
       <br>
     
       <br>
         <logic:iterate name="li" id="idl"  >
            
             <table border="2"> 
                  <tr name="fila">
                     <td name="nombre"> Equipo:          <bean:write name="idl" property="nombre"/> </td> 
                     <td name="puntos"> Puntos:          <bean:write name="idl" property="puntos"/> </td>
                     <td name="calificaciones"> Cantidad de Calificaciones:      <bean:write name="idl" property="calificaciones"/> </td>
                     <td name="promedio"> Promedio:      <bean:write name="idl" property="promedio"/> </td> 
                     
                  </tr> 
             </table>
       
               
            </logic:iterate>
       
         
         
         <div class="header"> Ingrese el nombre del equipo a eliminar. </div>     
             <html:form action="/borrarPorEquipo"> 
              Equipo a eliminar:   <html:text name="NombreForm"  property="name" value=" " styleClass="caja"  />
              <html:errors property="name" />
              <html:submit value="-"  styleClass="botonLogin" />
         </html:form>
              
          
              </div>          
          
    </div>
    
   
</html:html>
