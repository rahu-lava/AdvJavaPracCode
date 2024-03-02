<%-- 
    Document   : index
    Created on : 29-Feb-2024, 9:24:59 pm
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
        <jsp:useBean class="Practical8a.Practical8a" id="cal">
            <pre>
Time:<jsp:getProperty name="cal" property="time"/><br>
Hour:<jsp:getProperty name="cal" property="hour"/><br>
Minute:<jsp:getProperty name="cal" property="minute"/><br>
Second:<jsp:getProperty name="cal" property="second"/><br>
Name:<jsp:getProperty name="cal" property="lava"/><br>
            </pre>
        </jsp:useBean>
    </body>
</html>
