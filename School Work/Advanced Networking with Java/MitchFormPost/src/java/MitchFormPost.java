/*
 * Mitch Meyer
 * 4/12/16
 * Assignment 4.1
 * Bellevue University
 * MitchFormPost.java
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;



@WebServlet(name = "MitchFormPost", urlPatterns = {"/MitchFormPost"})
public class MitchFormPost extends HttpServlet {
    
    private String target = "localhost:8080";

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        printHeader(out);
        printForm(out);
        printFooter(out);
    }
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        final int BUFFER_LENGTH = 51;
        String data = null;
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:/temp/mitchweek4.dat", "rw");
        
        StringBuffer bufferName = new StringBuffer(request.getParameter("myName"));
        StringBuffer bufferEmail = new StringBuffer(request.getParameter("myEmail"));
        StringBuffer bufferColor = new StringBuffer(request.getParameter("myColor"));
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        printHeader(out);
        printForm(out);
        
        bufferName.setLength(BUFFER_LENGTH);
        bufferEmail.setLength(BUFFER_LENGTH);
        bufferColor.setLength(BUFFER_LENGTH);
        
        bufferName.setCharAt(BUFFER_LENGTH - 1, '\n');
        bufferEmail.setCharAt(BUFFER_LENGTH - 1, '\n');
        bufferColor.setCharAt(BUFFER_LENGTH - 1, '\n');
        
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeChars(bufferName.toString());
        randomAccessFile.writeChars(bufferEmail.toString());
        randomAccessFile.writeChars(bufferColor.toString());
        
        randomAccessFile.seek(0);
        
        while((data = randomAccessFile.readLine()) != null){
            
            out.println(data + "<br />");
        }
        
        printFooter(out);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    public void printHeader(PrintWriter out){
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Mitch Meyer: Post & Get");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
    }
    
    public void printFooter(PrintWriter out){
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    public void printForm(PrintWriter out){
        
        out.println("<form method='post' action='http://" + target + "/Week_04/servlet/FormPostGet'>");
        out.println("<label>Enter Name</label>   ");
        out.println("<input type='text' name='myName' size='50' maxlength='50'/>");
        out.println("<label>Enter Email</label>  ");
        out.println("<input type='text' name='myEmail' size='50' maxlength='50'/> ");
        out.println("<label>Enter Favorite Color</label>");
        out.println("<input type='text' name='myColor' size='50' maxlength='50'/>");
        out.println("<input type='submit' />");
        out.println("</form>");
    }

}
