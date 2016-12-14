/* Mitchell Meyer
 * 6/16/15
 * Assignment 2.2
 * Bellevue University
 * Carpet.cs
*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Carpet
{
    class Carpet
    {
        static void Main(string[] args)
        {
            // Assign variables for price and room dimensions
            float price = 1.44F;
            double length;
            double width;
            double totalPrice;

            // Display price of carpet in the console
            Console.WriteLine("The price per squre foot of carpet is $" + price + ".");

            // Request user input for room length
            Console.Write("Please enter the length of room to be carpeted: ");         
            length = Convert.ToDouble(Console.ReadLine());
            
            // Request user input for room width
            Console.Write("Please enter the width of the room to be carpeted: ");
            width = Convert.ToDouble(Console.ReadLine());

            // Calculate cost of carpeting
            totalPrice = price * width * length;

            // Convert price to currency value
            string conversion = totalPrice.ToString("c2");

            // Display room parameters and price for carpeting
            Console.WriteLine("The length of the room is " + length + ", the width is "
                + width + ", and the price for carpeting is \n" 
                + conversion +".");                         
        }
    }
}
