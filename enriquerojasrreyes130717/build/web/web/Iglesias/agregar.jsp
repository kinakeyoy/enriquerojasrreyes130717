<%-- 
    Document   : agregar
    Created on : 12/07/2017, 08:58:01 PM
    Author     : KikeVostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Iglesia</title>
    </head>
    <body>
    <center>
        <h1>!::Sitio  para Agregar Iglesias::!</h1>   
        <div align="center" style="width: 70% ">        
            <form align="right"  " action="<%=request.getContextPath()%>/ciglesia" name="formiglesia" method="POST" >
                <fieldset style="width: 30% ">
                    <legend >
                        <b>Datos Para Agregar Una Nueva Iglesia</b>
                    </legend>                
                    <label style="width: 50% ">Nombre:</label>            
                    <input type="text" name="nombre" style="width: 50% ">
                    <br>
                    <label style="width: 50% ">Zona:  </label>
                    <input type="number" name="zona" style="width: 50% ">
                    <br>
                    <label style="width: 50% ">Direccion:</label>
                    <input type="text" name="direccion" style="width: 50% ">
                    <br>
                    <label style="width: 50% ">Sacerdote:</label>
                    <input type="text" name="sacerdote" style="width: 50% ">
                    <br>
                    <input type="submit" name="accion" value="uardar" > 
                    <input type="reset" name="limpiar" value="Limpiar" >

                </fieldset>
                <form>
                    </div>
                    </center>
                    <hr style="width: 50%">
                    <p style="text-align: center">
                        <span style="text-decoration-color: red ">
                            <%=request.getParameter("mensaje")%> 
                        </span>
                    </p>
                    </body>
                    </html>
