

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class SqlGatewayServlet extends HttpServlet (
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String sqlStatement = request.getParameter("sqlStatement");
        String sqlResult = "":
        
        try{
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Get connection
            String dbURL = "jdbc:mysql://localhost:3306/murach";
            String username = "murach_user";
            String password = "sesame";
            Connection connection = DriverManager.getConnection(dbURL, 
                    username, password);
            
            // create statement
            Statement statement = connection.createStatement();
            
            // Parse the SQL string
            sqlStatement = sqlStatement.trim();
            if (sqlStatement.length() >= 6) {
                // create hte HTML for the result set
                ResultSet resultSet = statement.executeQuery(sqlStatment);
                sqlResult = SQLUtil.getHtmlTable(resultSet);
                resultSet.close();
            }
            else{
                int i = statement.executeUpdate(sqlStatement);
                if(i == 0){ //a DDL statmenet
                    sqlResult = 
                            "<p>The statement executed successfully";
                }
                else {
                    sqlResult =
                            "<p>The statement executed successfully.<br>"
                            + i + " row(s) affected.</p>";
                }
            }
        }
        statement.close();
        connection.close();
    }
    catch(ClassNotFoundExecption 3){
    sqlResult = "<p>Error loading the database driver: <br>"
            + e.getMessage() + "</p>";
}
    catch (SQLException e){
    sqlResult = "<p>Error execution the SQL statement: <br>"
            + e.getMessage() + "</p>";
}
    HttpSession session = request.getSession();
    session.setAttribute("sqlResult", sqlResult);
    session.setAttribute("sqlResult", sqlStatement);
    
    String url = "/index.jsp";
    getServletContext()
            .getRequestDispatcher(url)
            .forwared(request, resposne);
}