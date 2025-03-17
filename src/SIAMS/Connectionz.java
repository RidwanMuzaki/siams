/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIAMS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zaki
 */
public class Connectionz {
    static Connection con;
    
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siams","root","");
                                                                        //database name, "db username", "password"
            
        } catch(Exception ex){
            System.out.println(""+ex);
        }
        return con;
    }
}
