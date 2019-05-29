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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import business.*;

@WebServlet(name = "showProducts", urlPatterns = {"/showProducts"})
public class showProducts extends HttpServlet {
    
    
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
        
            ArrayList<Product> products = new ArrayList<>();
            Product product;
            GestorDB gestorDB = new GestorDB();
            
            products = gestorDB.readAll();
            
            if(products != null){
                request.setAttribute("products", products);
                request.getRequestDispatcher("/listProducts.jsp").forward(request, response);
            }else
                request.getRequestDispatcher("/thereisnotproducts.jsp").forward(request, response);
        }finally{
            out.close();
        }
    }
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        processRequest(request, response);
    }
}
