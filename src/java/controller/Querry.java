/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Alfredo
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import business.*;
import java.util.ArrayList;

@WebServlet(name = "querry", urlPatterns={"/querry"})
public class Querry extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        
        try {
        
            Product product;
            GestorDB gestorDB = new GestorDB();
            
            product = gestorDB.query(id, name);
            
            if(product != null){
                request.setAttribute("attrProdu", product);
                
                request.getRequestDispatcher("/resultQuery.jsp").forward(request, response);
            
            }else
                request.getRequestDispatcher("/noFound.jsp").forward(request, response);
            
        }finally{
            out.close();
        }
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        processRequest(request, response);
    }
}
