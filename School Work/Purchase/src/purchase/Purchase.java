/*
 * Mitch Meyer
 * 1/26/2016
 * Assignment 3.2
 * Bellevue University
 * Intermediate Java
 */

import javax.swing.*;

public class Purchase {

    private int invoiceNum;
    private double purchaseTot;
    private static double salesTax;
    
    
    
    public void setInvoiceNum(int invoice){
        invoiceNum = invoice;
    }
    public int getInvoiceNum(){
        return invoiceNum;
    }
    public void setPurchaseTot(double purchase){
        purchaseTot = purchase;
        salesTax = purchase * .075;
    }
    public double getPurchaseTot(){
        return purchaseTot;
    }
    public void displayOrder (){
        JOptionPane.showMessageDialog(null, "Invoice Number: " + invoiceNum 
                + "\nPurchase Amount: $" + purchaseTot + "\nSales Tax: $" 
                + String.format("%.2f", salesTax));
    }
    public Purchase(int invoice, double purchase){
        invoiceNum = invoice;
        purchaseTot = purchase;
        salesTax = purchase * .075;
        
    }
    public static void main(String[] args) {
        // Create instance for testing
        Purchase testOne = new Purchase(12345, 19.99);
              
        testOne.displayOrder();
        
        System.exit(0);
        
    }
    
}
