/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package calcGst;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rahul
 */
public class calcGst extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        double price = Double.parseDouble(request.getParameter("price"));
        
        int selectedPercentage = Integer.parseInt(request.getParameter("percent"));
        
        double gstAmount = (selectedPercentage / 100.0) * price;
        
        PrintWriter output = response.getWriter();
        output.println("The GST Calculated : " + gstAmount);
        
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
        double price = Double.parseDouble(request.getParameter("price"));
        
        int selectedPercentage = Integer.parseInt(request.getParameter("percent"));
        
        double gstAmount = (selectedPercentage / 100.0) * price;
        
        PrintWriter output = response.getWriter();
        output.println("The GST Calculated : " + gstAmount);
        
    }
}
