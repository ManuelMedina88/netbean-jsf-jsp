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
import java.sql.DriverManager;

public class ConnectDB {
    
    public static Connection con;
    private static String db = "store";
    public static String user = "root";
    public static String pass = ""; 
    public static String url = "jdbc:mysql://localhost/"+db;
    
    public static Connection openDB(){
    
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                
            }catch(Exception e){
                
                System.out.println("Error on the connection");
                e.printStackTrace();
                
            }
            return con;
    }
    
    public static void closeDB(){
        try {
            
            if(con != null)
                con.close();
            
        } catch(Exception e){
            
            System.out.println("Error: No se logro cerrar conexion:\n"+e);
            
        }
    }
    
}
