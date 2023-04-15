package com.pedro.servlet;


import java.io.IOException;
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
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
      /*  String param = req.getParameter("nombre");
        if (param == null){
        resp.getWriter().append("Hola, como estas?");
        }else{
        String saludo = "Hola," + param + "!";
        resp.getWriter().append(saludo);
        }
        */
      
        req.setAttribute("name", "Pedro");
        req.getServletContext().getRequestDispatcher("/paginainicio.jsp").forward(req,resp);
        
    }
    
}
