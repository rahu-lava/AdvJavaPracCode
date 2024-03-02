<%-- 
    Document   : index
    Created on : 29-Feb-2024, 8:30:38 pm
    Author     : rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<%@ page import = "java.io.*, java.util.*,java.sql.*"%>--%>
<%--<%@ page import = "javax.servlet.http.*,javax.servlet.*"%>--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<%--<%@taglib uri="" %>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <sql:setDataSource 
            var="raju" driver="com.mysql.jdbc.Driver"
            
                           url="jdbc:mysql://localhost/zoom"
                           user="root"
                           password=""
                           />
        
        <sql:update dataSource="${raju}" >
            Insert into product values('ElonMusk','110');
        </sql:update>
            
            <sql:update dataSource="${raju}" >
                Delete from product where gst=18 ;
            </sql:update>
                
                <sql:query dataSource="${raju}" var="sumit" >
                    
                    Select * from product;
                </sql:query>
                    
                    <table border="1" width="100%" >
                        <tr>
                        <th>Product Name</th>
                        <th>Product GST</th>
                        </tr>
                        
                        <core:forEach var="row" items ="${sumit.rows}" >
                            
                            
                             <tr>
                            
                                 <td> <core:out value="${row.name}"   /> </td>
                                 <td> <core:out value="${row.gst}"   /> </td>
                            
                             </tr>
                            
                            
                        </core:forEach>
                        
                       
                        
                        
                        
                        
                        
                    </table>
                
                
        
        
        
            

    </body>
</html>
