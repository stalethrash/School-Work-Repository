/* Mitchell Meyer
 * 6/28/15
 * Assignment 4.2
 * Bellevue University
 * CIS355-309H 
 * InchesToFeet.cs
*/ 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InchesToFeet
{
    class InchesToFeet
    {
        static void Main(string[] args)
        {
            // Declare a variable to be tested
            int inches;

            // Prompt user to enter value for inches
            Console.Write("Please enter value for inches to be converted: ");

            // Receive input from user
            inches = Convert.ToInt32(Console.ReadLine());

            ConvertInches(inches);
        }

        public static void ConvertInches(int param){

            // Determine number of remaining inches in param
            int inches = param % 12;
            // Determine number of feet in param
            int feet = param / 12;

            // Display results
            Console.WriteLine("{0} inches is equal to {1} feet and {2} inches.", param, feet, inches);


        }
    }
}
