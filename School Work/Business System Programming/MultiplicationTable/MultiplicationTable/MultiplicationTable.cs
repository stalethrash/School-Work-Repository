/* Mitchell Meyer
 * 6/18/15
 * Assignment 3.2
 * Bellevue University
 * MultiplicationTable.cs
 * 
*/
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiplicationTable
{
    class MultiplicationTable
    {
        static void Main(string[] args)
        {
            // Create a table header
            Console.WriteLine("                  Multiplication Table");
            // Use a loop to print x axis numbers of table
            for (int z = 1; z < 11; ++z)
            {
                // Use if statement to control format of table
                if (z == 1)
                {
                    Console.Write("{0, 8}", z);
                }
                else
                {
                    Console.Write("{0, 5}", z);
                }
            }
            // WriteLine statement starts new line
            Console.WriteLine(""); 
            // Dashes used to separted multiplied numbers from the table values
            Console.WriteLine("----------------------------------------------------");
            
            // Nested for loops used to write and format mulitplication table 
            for (int x = 1; x < 11; ++x)
            {
                Console.Write("{0, 2}|", x);
                for (int y = 1; y < 11; ++y)
                {
                    int total = x * y;
                    Console.Write("{0, 5}", total);
                }
                Console.WriteLine("");
            }
            
        }
    }
}
