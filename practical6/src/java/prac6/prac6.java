/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package prac6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class prac6 extends HttpServlet {


  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String gst = request.getParameter("drop");
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/zoom","root","");
            Statement st = con.createStatement();   
            
             st.executeUpdate("DELETE FROM product WHERE name = '"+name+"' ");
                
//            if (resp>0){
                System.out.println("Insert Done");
//            }
            


            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);

        } catch (SQLException ex) { 
             System.out.println(ex);

        }
        
        
        
     
        

    }



}
