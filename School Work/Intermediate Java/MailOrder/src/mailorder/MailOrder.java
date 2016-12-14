/*
 * Mitch Meyer
 * 3/8/2016
 * Assignment 9.1
 * Bellevue University
 * MailOrder.java
 */

import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class MailOrder {

    
    public static void main(String[] args) {
        
        Path file = Paths.get("MailOrder.txt");
        
        String order = "";
        String delimit = ",";
        String item = "";
        String qty = "";
        int cont = 0;
        
        item = JOptionPane.showInputDialog("Enter an Item Number \nto be ordered.");
        qty = JOptionPane.showInputDialog("Enter qty to be ordered.");
        
        order = item + delimit + qty + "\n";
        try{    
            
        OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        writer.write(order, 0, order.length());
        writer.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Message: " + e);
                    }
        System.exit(0);
    }
    
}
