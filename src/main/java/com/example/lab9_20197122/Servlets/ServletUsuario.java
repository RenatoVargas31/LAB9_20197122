package com.example.lab9_20197122.Servlets;

import com.example.lab9_20197122.Beans.Usuario;
import com.example.lab9_20197122.Daos.DaoUsuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletUsuario", value = "/ServletUsuario")
public class ServletUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String action = request.getParameter("action") == null ? "mostrarListaUsuarios" : request.getParameter("action");

        DaoUsuario daoUsuario = new DaoUsuario();

        switch (action){
            case "mostrarListaUsuarios":
                ArrayList<Usuario> listUsuario = daoUsuario.listarUsuarios();
                request.setAttribute("listaUsuario", listUsuario);
                request.getRequestDispatcher("WEB-INF/listaUsuarios.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
