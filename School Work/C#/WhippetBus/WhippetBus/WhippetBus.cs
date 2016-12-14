/* Mitchell Meyer
 * 6/18/15
 * Assignment 3.3
 * Bellevue University
 * WhippetBus.cs
*/
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WhippetBus
{
    class WhippetBus
    {
        static void Main(string[] args)
        {
            // Declare constants for ticket prices
            const double TICKET_99 = 25.00;
            const double TICKET_299 = 40.00;
            const double TICKET_499 = 55.00;
            const double TICKET_500 = 70.00;

            // Prompt user to enter trip distance
            Console.Write("Enter trip distance in miles for ticket price: ");
            int userDistance = Int32.Parse(Console.ReadLine());

            // Determine ticket price based on user entered distance
            if (userDistance <= 99)
            {
                Console.WriteLine("The ticket price for a trip of {0} miles is {1}."
                    , userDistance, TICKET_99.ToString("C"));
            }
            else if (userDistance >= 100 && userDistance <= 299)
            {
                Console.WriteLine("The ticket price for a trip of {0} miles is {1}."
                    , userDistance, TICKET_299.ToString("C"));
            }
            else if (userDistance >= 300 && userDistance <= 499)
            {
                Console.WriteLine("The ticket price of a trip of {0} miles is {1}."
                    , userDistance, TICKET_499.ToString("C"));
            }
            else
            {
                Console.WriteLine("The ticket of a trip of {0} miles is {1}."
                    , userDistance, TICKET_500.ToString("C"));
            } 
        }
    }
}
