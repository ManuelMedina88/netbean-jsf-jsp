/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alfredo
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;
import business.*;

public class GestorDB {
    
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet productResSet;
    private Product foundProduct;
    private int id, quantity;
    String name;
    Double price; 
    
    
    public boolean register(int id, String name, Double price, int quantity){
    
       
       Statement statement = null;
       ResultSet resultSet;
       int resultUpdate = 0;
       
       try{
           
           connection = ConnectDB.openDB();
           statement = connection.createStatement();
           resultUpdate = statement.executeUpdate("insert into products values('" + id + "','" 
                   + name + "','" + price + "','" + quantity + "');");
           
           if(resultUpdate != 0){
               
               ConnectDB.closeDB();
               return true;
               
           }else{
               
               ConnectDB.closeDB();
               return false;
               
           }
           
       }catch(Exception e){
           
           System.out.println("Error on the data base.");
           e.printStackTrace();
           return false;
           
       }
    }
    
    public Product query(int id, String name){
    
        try{
        
            connection = ConnectDB.openDB();
            statement = connection.createStatement();
            productResSet = statement.executeQuery("SELECT * FROM products where id='" +
                    id + "' and name='" + name + "'");
            
            if(!productResSet.next()){
                System.out.println("We couldn't find you product.");
                ConnectDB.closeDB();
                return null;
            }else{
                System.out.println("The product was found successfully!");
                this.id = productResSet.getInt("id");
                this.name = productResSet.getString("name");
                this.price = productResSet.getDouble("price");
                this.quantity = productResSet.getInt("quantity");
                foundProduct = new Product(String.format("%d", this.id), this.name, this.price, this.quantity);
                ConnectDB.closeDB();
                return foundProduct;
            }
            
        }catch(Exception ex){
            System.out.println("Error in the data base.");
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Product> readAll(){
    
        ArrayList<Product> products = new ArrayList<Product>();
        
        try{
        
            connection = ConnectDB.openDB();
            statement = connection.createStatement();
            productResSet = statement.executeQuery("select * from products");
            if(!productResSet.next()){
           
                System.out.println(" Products weren't found");
                ConnectDB.closeDB();
                return null;
            }else{
            
                do{
                    this.id = productResSet.getInt("id");
                    this.name = productResSet.getString("name");
                    this.price = productResSet.getDouble("price");
                    this.quantity = productResSet.getInt("quantity");
                    this.foundProduct = new Product(String.format("%s", id), name, price, quantity);
                    products.add(foundProduct);                           
                }while(productResSet.next());
                ConnectDB.closeDB();
                return products;
            }
        }catch(Exception ex){
            System.out.println("Error in the data base.");
            ex.printStackTrace();
            return null;
        }
        
    }
}