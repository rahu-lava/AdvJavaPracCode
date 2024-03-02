/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gstcalc2;

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
public class gstcalc2 extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Double amt = Double.parseDouble(request.getParameter("num1"));
        int sel = Integer.parseInt(request.getParameter("drop"));
        
        Double calc = (amt * sel)/100; 
        
        
       PrintWriter out = response.getWriter();

       out.println("GST calculated : " + (calc+amt) );
       
       
    }

}
