<%@ page import="com.example.lab9_20197122.Beans.Usuario" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: rlvs_
  Date: 19/06/2024
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Usuarios</title>

    <link rel="stylesheet" href="https://cdn.datatables.net/2.0.8/css/dataTables.dataTables.css"/>
</head>
<body>
<table id="example" class="display" style="width:100%">
    <thead>
    <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Tipo de Licencia</th>
        <th>Pais origen</th>

    </tr>
    </thead>
    <%
        ArrayList<Usuario> listaUsuario = (ArrayList<Usuario>) request.getAttribute("listaUsuario");
    %>
    <tbody>
    <%for (Usuario usuario : listaUsuario) {%>
    <tr>
        <td><%= usuario.getNombres() %></td>
        <td><%= usuario.getApellidos() %></td>
        <td><%= usuario.getLicencia().getCategoria() %></td>
        <td><%= usuario.getLicencia().getPais()%></td>
    </tr>
    <% } %>
    </tbody>
</table>
<script src="https://cdn.datatables.net/2.0.8/js/dataTables.js"></script>
</body>
</html>
