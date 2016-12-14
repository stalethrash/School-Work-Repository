/*
 * Mitch Meyer
 * Today's Date
 * Exercise Number
 * Bellevue University
 * Class Name
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


@WebServlet(name = "Week3Servlet", urlPatterns = {"/Week3Servlet"})
public class Week3Servlet extends HttpServlet {
static Charset myCharset = Charset.forName("US-ASCII");

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{

    response.setContentType("text/html");

    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>");
    out.println("Read/Write File Servlet");
    out.println("</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<div>");

    writeAndReadFile(out);

    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
    
    

    }
    private synchronized void writeAndReadFile(PrintWriter out){

    try{

      Path target = Paths.get("C:\\Temp\\servlet1.dat");

      Calendar calendar = Calendar.getInstance();
      String s1 = calendar.getTime().toString();
      String s2 = "Random number = " + String.valueOf((int)(Math.random() * 1000 + 1));

      List <String> linesToWrite = Arrays.asList(s1, s2);

      if(Files.notExists(target)){

        Files.write(target, linesToWrite, myCharset);
      }
      else{

        Files.write(target, linesToWrite, myCharset, StandardOpenOption.APPEND);
      }

      Path source = Paths.get("C:\\Temp\\servlet1.dat");

      List <String> linesRead = null;

      linesRead = Files.readAllLines(source, myCharset);      

      if(linesRead != null){

        for(String line : linesRead){

          out.println(line+ "<br />\n");
        }
      }
    }
    catch(IOException e){

    }
  }
}