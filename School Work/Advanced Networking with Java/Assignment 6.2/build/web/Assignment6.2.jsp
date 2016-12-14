<%-- 
    Document   : Assignment6.2
    Created on : Apr 26, 2016, 11:20:50 AM
    Author     : Amanda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Murach's Java Servlets and JSP</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            
        <h1>Join our email list</h1>
        <p>To join our email list, enter your name and
            email address below.</p>
        
        <c:if test="${message != null}">
            <p><i>${message}</i></p>
        </c:if>
            
            <form action="emailList" method="post">
                <input type="hidden" name="action" value="add">
                <label class="pad_top">Email:</label>
                <input type="email" name="email" value="${user.email}"><br>
                <label class="pad_top">First Name:</label>
                <input type="text" name="firstName" value="${user.firstName}"><br>
                <lable class="pad_top">Last Name:</lable>
                <input type="text" name="lastName" value="${user.lastName}"><br>
                <label>&nbsp;</label>
                <input type="submit" value="Join Now" class="margin_left">
            </form>
                
        <%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
        <%
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);
        %>
        <p>&copy; Copyright <%= currentYear %> Mike Murach &amp; Associates</p>
    </body>
</html>
