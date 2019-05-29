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

@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
        
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try{
            
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Double price = Double.parseDouble(request.getParameter("price"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            
            GestorDB gestorDB = new GestorDB();
            
            if(gestorDB.register(id, name, price, quantity)){
               
                request.getRequestDispatcher("/savedRegister.jsp").forward(request, response);
            
            }else
               
                request.getRequestDispatcher("/errorOnRegister.jsp").forward(request, response);
        
        }finally{
            
                out.close();
                
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException{
    
        processRequest(request, response);
        
    }
}
    

