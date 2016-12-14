/*
 * Mitch Meyer
 * 5/10/2016
 * Assignment 8.1
 * Bellevue University
 * CurrentTime.java
 */

package myTags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class CurrentTime extends TagSupport {
    
    @Override
    public int doStartTag() throws JspException{
        Date currentTime = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        String currentTimeFormatted = time.format(currentTime);
    
    
    try{
        JspWriter out = pageContext.getOut();
        out.print(currentTimeFormatted);
    }
    catch(IOException ioe){
    System.out.println(ioe);
    }
    return SKIP_BODY;
    
}
}
    
