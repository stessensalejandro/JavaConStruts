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
        <title>Registrese aqui</title>
        <html:base/>
     <link rel="stylesheet" type="text/css" href="css/estilos.css" />
     <link rel="stylesheet" type="text/css" href="css/fonts.css" />
      <link rel="shortcut icon" type="image/x-icon" href="css/favicon.png" />
    </head>
    <body>


        <div style="color:red">
            <html:errors />
        </div>
        <div class="header">
        <html:form action="/Login" >
            <div class="centrar">
          Usuario   : <html:text name="LoginForm" property="userName" styleClass="caja" /> <br>
          Clave : <html:password name="LoginForm" property="password" styleClass="caja" /> <br>
           </div>
           <br>
            <div class="centrar">
                <html:submit value="Login" styleClass="botonLogin"/>
            </div>
          </div>
         </div>  
        </html:form> 
            
              <div class="centrar">    
            
             <logic:iterate name="li" id="idl"  >
                 <table border="2"> 
                 <tr>
                     <td> Equipo:          <bean:write name="idl" property="nombre"/> </td> 
                     <td> Puntos:          <bean:write name="idl" property="puntos"/> </td>
                 </tr>     
                   </table>
             </logic:iterate> 
            
                  </div>
    </body>
</html>

