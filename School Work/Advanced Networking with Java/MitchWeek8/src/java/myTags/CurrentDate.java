/*
 * Mitch Meyer
 * 5/10/2016
 * Assignment 8.1
 * Bellevue University
 * CurrentDate.java
 */
package myTags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;

public class CurrentDate extends TagSupport {
    
    @Override
    public int doStartTag() throws JspException{
        Date currentDate = new Date();
        DateFormat shortDate = DateFormat.getDateInstance(DateFormat.SHORT);
        String currentDateFormatted = shortDate.format(currentDate);
    
    
    try{
        JspWriter out = pageContext.getOut();
        out.print(currentDateFormatted);
    }
    catch(IOException ioe){
    System.out.println(ioe);
    }
    return SKIP_BODY;
    
}
}


