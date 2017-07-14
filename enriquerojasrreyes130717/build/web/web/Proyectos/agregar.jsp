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
        <title>Agregar Proyectos</title>
    </head>
    <body>
    <center>
        <h1>!::Sitio  para Agregar Proyectos::!</h1>   
        <div align="center" style="width: 70% ">        
            <form align="right" action="<%=request.getContextPath()%>/ctproyectos" name="formproyecto" method="GET" >
                <fieldset style="width: 50% ">
                    <legend >
                        <b>Datos Para Agregar Una Nuevo Proyecto</b>
                    </legend>                
                    <label style="width: 50% ">Nombre:</label>            
                    <input type="text" name="nombre" style="width: 50% " required>
                    <br>
                    <label style="width: 50% ">Fecha De Inicio:  </label>
                    <input type="text" name="fechadeinicio" style="width: 50% " required>
                    <br>
                    <label style="width: 50% ">Fecha Final:</label>
                    <input type="text" name="fechafinal" style="width: 50% "required>
                    <br>
                    <label style="width: 50% ">Director:</label>
                    <input type="text" name="director" style="width: 50% "required>
                    <br>
                    <label style="width: 50% ">Cliente:</label>
                    <input type="text" name="cliente" style="width: 50% "required>
                    <br>
                    <label style="width: 50% ">Descripcion:</label>
                    <input type="text" name="descripcion" style="width: 50% "required>
                    <br>
                    <label style="width: 50% ">Valor:</label>
                    <input type="text" name="valor" style="width: 50% "required>
                    <br>
                    <input type="submit" name="accion" value="Guardar" > 
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
