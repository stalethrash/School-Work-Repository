/*
 * Mitch Meyer
 * 4/19/2016
 * Assignment 5.1
 * Bellevue University
 * MitchMeyerFormPost2.java
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.*;


public class MitchMeyerFormPost2 extends HttpServlet {

    private String target = "localhost:7070";
    private String target2 = "database_form";
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        Connection con = null;
        
        Statement stmt = null;
        
        printHeader(out);
        
        try{
            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student1", "pass");
            
            stmt = con.createStatement();
        }
        
        catch(Exception e){
            out.println("<h1>Error connection to database.</h1>");
            printFooter(out);
            return;
        }
        
        // create database table 
        try{
            stmt.executeUpdate("CREATE TABLE WEEK5_TABLE(Name CHAR(40) NOT NULL,"
                    + "Email CHAR(40) NOT NULL, Color CHAR(20) NOT NULL, Age CHAR(3) NOT NULL");
            out.println("<b>Week 5 table created</b><br/>");
            }
        catch(SQLException e){
            out.println("<b>Week 5 table creation failed</b><br/>");
        }
        
        try{
            stmt.close();
            con.close();
            out.println("<b>Database connection closed</b><br/>");
        }
        catch(SQLException e){
            out.println("<b>Connection close failed</b><br/>");
                    
        }
        
        printForm(out);
        printFooter(out);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection("dbdc:oracle:thin:@localhost:1521:XE", "student1", "pass");
            stmt = con.createStatement();
        }
        catch(Exception e){
            out.println("<h1>Error connection to database.</h1>");
        }
        
        try{
            String name = request.getParameter("myName");
            String email = request.getParameter("myEmail");
            String color = request.getParameter("myColor");
            String age = request.getParameter("myAge");
            
            resultSet = stmt.executeQuery("INSERT INTO WEEK5_TABLE(Name, Email, Color, Age)VALUES('" + name 
                    + "', '" + email+ "','" + color +"', " + age + "");
            stmt.executeUpdate("COMMIT");
                    
        }
        catch(SQLException e){
            out.println("<b>Failed database update.</b>");
            
        }
        
        try{
            resultSet = stmt.executeQuery("SELECT * FROM WEEK5_TABLE");
        }
        catch(SQLException e){
            out.println("<b>Failed database output.</b>");
        }
        
        try{
            out.println("<table border=1>");
            out.println("<tr bgcolor='white'>");
            
            out.println("<th>");
            out.println("   Name   ");
            out.println("</th>");
            
            out.println("<th>");
            out.println("  Email   ");
            out.println("</th>");
            
            out.println("<th>");
            out.println("   Color   ");
            out.println("</th>");
            
            out.println("<th>");
            out.println("   Age   ");
            out.println("</th>");
            
            out.println("</tr>");
            
            while(resultSet.next()){
                
               for(int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++){
                   
                   out.println("<td>");
                   out.println((resultSet.getString(i)).trim() + "  ");
                   out.println("</td>");
               }
            }
            
            out.println("</table>");
        }
        catch(Exception e){
            out.println("<b>Print of results failed.</b><br/>");
        }
        
        try{
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            out.println("<b>Connection close failed.</b><br/>");
        }
        
        printFooter(out);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    public void printHeader(PrintWriter out){
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<title>");
        out.println("Mitch Meyer Form Post 2");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
    }
    
    public void printForm(PrintWriter out){
        
        out.println("<form method='post' action='" + target2 + "'>");
        out.println("<label>Enter Name</label>   ");
        out.println("<input type='text' name='myName' size='50' maxlength='50'/>");
        out.println("<label>Enter Email</label>  ");
        out.println("<input type='text' name='myEmail' size='50' maxlength='50'/> ");
        out.println("<label>Enter Favorite Color</label>");
        out.println("<input type='text' name='myColor' size='50' maxlength='50'/>");
        out.println("<label>Enter Age</label>");
        out.println("<input type='text' name='myAge' size='3' maxlength='3'/>");
        out.println("<input type='submit' />");
        out.println("</form>");
    }

    public void printFooter(PrintWriter out){
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

}
