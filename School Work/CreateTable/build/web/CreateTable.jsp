<html>

<%@ page import="java.io.*" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.sql.*" %>

<%! Connection con = null; %>
<%! Statement stmt = null; %>

  <head>
    <title>
      Create Table
    </title>
  </head>
  <body>

  <% 

    try{

      DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","$tal3Mat3");

      stmt = con.createStatement();
    }
    catch(Exception e){

      out.println("<h1>Error connection to database.</h1>");
    }

    try{

      stmt.executeUpdate("DROP TABLE Wins_S001");
      out.println("<b>Table Wins_S001 Dropped</b><br />");
    }
    catch(SQLException e){

      out.println("<b>Table Wins_S001 does not exist</b><br />");
    }

    try{

      stmt.executeUpdate("CREATE TABLE Wins_S001(Team CHAR(20) NOT NULL, City CHAR(20) NOT NULL, Year_T INT NOT NULL PRIMARY KEY, LoserTeam CHAR(20) NOT NULL, LoserCity CHAR(20) NOT NULL)");
      out.println("<b>Table Wins_S001 Created</b><br />");
    }
    catch(SQLException e){

      out.println("<b>Table Wins_S001 Creation failed</b><br />");
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

  </body>
</html>
