<%-- 
    Document   : MitchWeek6
    Created on : Apr 25, 2016, 8:55:29 PM
    Author     : Mitch Meyer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%@ page import="java.io.*" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.sql.*" %>

<%! Connection con = null; %>
<%! Statement stmt = null; %>
<%! ResultSet resultSet = null; %>


  <head>
    <title>
      Create Table
    </title>
  </head>
  <body>

  <%

    try{

      DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student1","pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      out.println("<h1>Error connection to database.</h1><br/>");
    }
    
    try{
        stmt.executeUpdate("DROP TABLE Class_Email");
        out.println("<b>Class_Email Dropped</b><br/>");
    }
    catch(SQLException e){
        out.println("<b>Table Class_Email does not exist</b><br/>");
    }
    
    try{
        stmt.executeUpdate("CREATE TABLE Class_Email(Email CHAR(20) NOT NULL, First_Name CHAR(20) NOT NULL, "
            + "Last_Name CHAR(20) NOT NULL)");
        out.println("<b>Class_Email table created</b><br/>");
    }
    catch(SQLException e){
        out.println("<b>Class_Email creation failed</b><br/>");
    }    
    try{
      stmt.close();
      con.close();
      out.println("<b>Database connections closed</b><br />");
    }
    catch(SQLException e){
      out.println("<b>Connection close failed</b><br />");
    }
%>

<% 

    if(request.getMethod().equals("POST")){
      try{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student1","pass");
        stmt = con.createStatement();
      }
      catch(Exception e){
        out.println("<h1>Error connection to database.</h1>");
      }
      
      try{
          
          String email = request.getParameter("email");
          String firstName = request.getParameter("firstName");
          String lastName = request.getParameter("lastName");
          
          stmt.executeUpdate("INSERT INTO Class_Email(Email, First_Name, Last_Name)VALUES('" + email + "', '" + 
            firstName +"', '" + lastName + "')");
          stmt.executeUpdate("COMMIT");
      }
      catch(SQLException e){
          out.println("<b>Data update failed</b><br/>");
      }

      try{
          
          resultSet = stmt.executeQuery("SELECT * FROM Class_Email");      
      }
      catch(SQLException e){
          out.println("<b>Failed displaying table data</b><br/>");
      }
%> <table border="1">
    <tr>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <%
      
      try{
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
%> </table> <%
      
      try{
          stmt.close();
          con.close();
          out.println("<b>Database connection closed</b><br/>");
        }
      catch(SQLException e){
          out.println("<b>Connection close failed</b><br/>");
        }  

}
else{
%>

<form method='post' action='http://localhost:8084/MitchWeek6/MitchWeek6.jsp'>
            <label class='pad_top'>Email:</label>
            <input type='email' name='email' value="" maxlength="20"><br>
            <label class="pad_top">First Name:</label>
            <input type="text" name="firstName" value="" maxlength="20"><br>
            <label class="pad_top">Last Name:</label>
            <input type="text" name="lastName" value="" maxlength="20"><br>
            <input type="submit" value="Join Now" class="margin_left">
</form>
<%} %>


    