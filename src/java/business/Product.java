/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author Alfredo
 */
public class Product {
    
    private String id;
    private String name;
    private Double price;
    private int quantity;
    
    public Product(String key, String name, Double price, int quantity){
    
        this.id = key;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
    }
    
    public String getKey(){
        
        return id;
    
    }
    
    public String getName(){
        
        return name;
        
    }
    
    public Double getPrice(){
        
        return price;
        
    } 
    
    public int getQuantity(){
        
        return quantity;
        
    }
}
