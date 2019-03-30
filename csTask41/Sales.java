/**
 * Sales.java
 * Reads in and stores sales for each of 5 salespeople. Displays
 * sales entered by salesperson ID and total sales for all salespeople.
 * 
 * @author LLC
 * @version 01/05/2015
 */ 

import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        int sum;                            // Total sales for all salespeople
        int maxsales = -1;
        int maxsalesinterval = -1;
        int minsales = 999999999;
        int minsalesinterval = 999999999;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many salespeople are there?");
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE+1]; // Create an array of length 5
        /*
         * Read in and store sales for each of 5 salespeople.
         */
        for (int i=1; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
            if (sales[i]>maxsales)
            {
                maxsales = sales[i];
                maxsalesinterval = i;
            }
            if (sales[i]<minsales)
            {
                minsales = sales[i];
                minsalesinterval = i;
            }
        }
        System.out.println("Salesperson " + maxsalesinterval + " had the highest sale with " + maxsales +".");
        System.out.println("Salesperson " + minsalesinterval + " had the lowest sale with " + minsales +".");
        /*
         * Printout ID and sales for each salesperson and total sales 
         * for all salespeople
         */
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;        
        for (int i=1; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }        
        average = sum/5.0;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + average);
        
        System.out.println();
        System.out.println("Give a value so I can see who passed that value.");
        int val = scan.nextInt();
        for(int i=1; i<sales.length; i++)
        {
            if(sales[i]>=val)
            {
                System.out.println("Salesperson"+i+" passed "+val+".");
            }
        }  
    }
}