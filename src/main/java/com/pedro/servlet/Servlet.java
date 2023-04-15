package com.pedro.servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabian
 */ 

@WebServlet(urlPatterns="/inicio")
public class Servlet extends HttpServlet {
    private List<String> lista = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     
      
        req.setAttribute("nomina", lista);
        req.getServletContext().getRequestDispatcher("/paginainicio.jsp").forward(req,resp);
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        String nombre = req.getParameter("nombre");
        this.lista.add(nombre);
        resp.sendRedirect(req.getContextPath() + "/inicio");
    }
}
