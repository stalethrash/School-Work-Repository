<%-- 
    Document   : MitchFormPost4
    Created on : May 10, 2016, 5:30:28 PM
    Author     : Mitch Meyer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%@ page import="java.io.*" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.sql.*" %>
<%@ taglib uri="/WEB-INF/tlds/tagLibrary.tld" prefix="easy" %>

  <head>
    <title>
      Email List
    </title>
  </head>
  <body>
      
      <div>
          
          
          
<% 
    
    if(request.getMethod().equals("POST")){
%>        
        <jsp:useBean id='myDB' class='coffeeBeans.MyDataBase' />
          <jsp:setProperty name='myDB' property='userID' value='system' />
          <jsp:setProperty name='myDB' property='password' value='$tal3Mat3' />
<%     
      
      try{
          
          String email = request.getParameter("email");
          String firstName = request.getParameter("firstName");
          String lastName = request.getParameter("lastName");
          
          myDB.updateDatabase("INSERT INTO Class_Email(Email, First_Name, Last_Name)VALUES('" + email + "', '" + 
            firstName +"', '" + lastName + "')");
          myDB.updateDatabase("COMMIT");
      }
      catch(Exception e){
          out.println("<b>Data update failed</b><br/>");
      }
%> <table border="1">
    <tr>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <%
      
      try{
          ResultSet resultSet;
          resultSet = myDB.getResults("SELECT * FROM Class_Email");  
          while(resultSet.next()){
              %> <tr> <%
              for(int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++){
                  %> <td> <% out.print((resultSet.getString(i)).trim()); %> </td> <%
              }
              %> </tr> <%
          }
      }
      catch(Exception e){
      }
%> 
</table> 
<p> System date is <easy:currentDate/>.<p/>
    
<p> System time is <easy:currentTime/>.<p/>
<%
    myDB.closeConnection();  

}        
else{
%>

<form method='post' action='http://localhost:8084/MitchWeek8/MitchFormPost4.jsp'>
            <label class='pad_top'>Email:</label>
            <input type='email' name='email' value="" maxlength="40"><br>
            <label class="pad_top">First Name:</label>
            <input type="text" name="firstName" value="" maxlength="20"><br>
            <label class="pad_top">Last Name:</label>
            <input type="text" name="lastName" value="" maxlength="20"><br>
            <input type="submit" value="Join Now" class="margin_left">
</form>
<p> System date is <easy:currentDate/>.<p/>
    
<p> System time is <easy:currentTime/>.<p/>

<%
    } 
%>


    
    


    