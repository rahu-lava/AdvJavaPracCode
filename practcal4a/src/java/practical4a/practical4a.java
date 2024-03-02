/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package practical4a;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class practical4a extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        int sum = num1 + num2;
        int product = num1 * num2;
        
        PrintWriter output = response.getWriter();
        
        output.println("The Sum:" + sum);    
        output.println("\nThe product:" + product);
    
    }
}
