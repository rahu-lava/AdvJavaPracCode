/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package practical5aa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rahul
 */
public class practical5aa extends HttpServlet {

    private String msg;
    
    @Override
    public void init(ServletConfig con) throws ServletException{
    
        System.out.println("Am form init Method...!");
        msg = "Dubey maharaj";
    
    }
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
    
        out.println(msg);
    }
    
    @Override
    public void destroy(){
        System.out.println("Khatam Tata bye bye!");
    }


}
