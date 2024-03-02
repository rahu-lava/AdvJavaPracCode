<%-- 
    Document   : index
    Created on : 29-Feb-2024, 9:45:16 pm
    Author     : rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <jsp:useBean class="Practical8b.Practical8b" id="students" >

            <jsp:setProperty name="students" property="pehlaNaam" value="Elon"/>
            <jsp:setProperty name="students" property="ankhriNaam" value="Musk"/>
            <jsp:setProperty name="students" property="ummra" value="81"/>



        
        
                    <pre>
                <%--<jsp:useBean class="Practical8b.Practical8b" id="stud">--%>
            
                <jsp:getProperty name="students" property="pehlaNaam" /> <br>
                <jsp:getProperty name="students" property="ankhriNaam" /> <br>
                <jsp:getProperty name="students" property="ummra" /> <br>
            
</jsp:useBean>
            </pre>
        <%--</jsp:useBean>--%>


    </body>
</html>
