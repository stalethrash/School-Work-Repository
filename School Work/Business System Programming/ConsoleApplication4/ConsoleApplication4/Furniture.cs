/* Mitchell Meyer
 * 6/16/15
 * Assignment 2.3
 * Bellevue University
 * Furniture.cs
 * 
 */


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Furniture
    {
        static void Main(string[] args)
        {
            // Declare variables with table prices
            string pine = "$100.00";
            string oak = "$225.00";
            string mahogany = "$310.00";

            // Prompt user to request table price
            Console.Write("Please enter a value for a furniture price.\n");
            Console.Write("Enter P for pine, O for oak, or M for mohogany: ");

            // Receive user input
            string userInput = Console.ReadLine();

            // Compare user input and display table price
            if (userInput == "P")
            {
                Console.WriteLine("A pine table costs " + pine);
            }
            else if (userInput == "O")
            {
                Console.WriteLine("An oak table costs " + oak);
            }
            else if (userInput == "M")
            {
                Console.WriteLine("A mohogany table costs " + mahogany);
            }
            else
            {
                Console.WriteLine("Invalid entry, table price is $0.");
            }


        }
    }
}
