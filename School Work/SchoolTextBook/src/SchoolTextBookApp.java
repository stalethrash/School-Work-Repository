/*
 * Mitch Meyer
 * 2/9/2016
 * Assignment 5.1
 * Bellevue University
 * SchoolTextBookApp.java
 */

import javax.swing.*;
import SchoolTextBook.*;

public class SchoolTextBookApp {
    public static void main(String[] args) {
        
        // Create object array
        SchoolTextBook[] books = new SchoolTextBook[5];
        
        for (int x = 0; x < books.length; ++x){
            books[x] = new SchoolTextBook();
        }
        
        books[0].setAuthor("Ferrell");
        books[0].setTitle("Java Programming");
        books[0].setPageCount(994);
        books[0].setIsbn(1285856910);
        books[0].setPrice(187.95);
        
        books[1].setAuthor("Sebesta");
        books[1].setTitle("Programming the World Wide Web");
        books[1].setPageCount(739);
        books[1].setIsbn(132665816);
        books[1].setPrice(141.40);
        
        books[2].setAuthor("Heldman");
        books[2].setTitle("CompTIA Project+");
        books[2].setPageCount(323);
        books[2].setIsbn(470585924);
        books[2].setPrice(49.99);
        
        books[3].setAuthor("Liang");
        books[3].setTitle("Introduction to Java Programming");
        books[3].setPageCount(779);
        books[3].setIsbn(133592200);
        books[3].setPrice(154.80);
        
        books[4].setAuthor("Morris");
        books[4].setTitle("Database Systems");
        books[4].setPageCount(751);
        books[4].setIsbn(128519618);
        books[4].setPrice(249.95);
        
        String selection;
        int selectionInt;
        
        selection = JOptionPane.showInputDialog(null, "Please select sort method." 
                + "\nEnter 1 to sort by author.\nEnter 2 to sort by title." 
                + "\nEnter 3 to sort by page count.\nEnter 4 to sort by ISBN." 
                + "\nEnter 5 to sort by book price." );
        
        selectionInt = Integer.parseInt(selection);
        
        switch(selectionInt){
            case 1:
                authorSort(books);
                break;
            case 2:
                titleSort(books);
                break;
            case 3:
                pageCountSort(books);
                break;
            case 4:
                isbnSort(books);
                break;
            case 5:
                priceSort(books);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid sort entry.");
                
        }
        
        JOptionPane.showMessageDialog(null, books);
        
                
        
    }
    
    public static void authorSort(SchoolTextBook[] array)
    {
        int a, b;
        SchoolTextBook temp;
        int highSubscript = array.length -1;
        
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b){
                char x = array[b].getAuthor().charAt(0);
                char y = array[b +1].getAuthor().charAt(0);
                if(x > y){
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b +1] = temp;
                }
            }
    }
    
    public static void titleSort(SchoolTextBook[] array)
    {
        int a, b;
        SchoolTextBook temp;
        int highSubscript = array.length -1;
        
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b){
                char x = array[b].getTitle().charAt(0);
                char y = array[b +1].getTitle().charAt(0);
                if(x > y){
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b +1] = temp;
                }
            }
    }
    
    public static void pageCountSort(SchoolTextBook[] array)
    {
        int a, b;
        SchoolTextBook temp;
        int highSubscript = array.length -1;
        
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b){
                if(array[b].getPageCount() < array[b + 1].getPageCount()){
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b +1] = temp;
                }
            }
    }
    
    public static void isbnSort(SchoolTextBook[] array)
    {
        int a, b;
        SchoolTextBook temp;
        int highSubscript = array.length -1;
        
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b){
                if(array[b].getIsbn() < array[b + 1].getIsbn()){
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b +1] = temp;
                }
            }
    }
    
    public static void priceSort(SchoolTextBook[] array)
    {
        int a, b;
        SchoolTextBook temp;
        int highSubscript = array.length -1;
        
        for(a = 0; a < highSubscript; ++a)
            for(b = 0; b < highSubscript; ++b){
                if(array[b].getPrice() < array[b + 1].getPrice()){
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b +1] = temp;
                }
            }
    }
}
