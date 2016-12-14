/* Mitchell Meyer
 * 7/13/15
 * Assignment 6.3
 * Bellevue University
 * GoBeyondTheBounds.cs 
 * 
 */
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GoBeyondTheBounds
{
    class GoBeyondTheBounds
    {
        static void Main(string[] args)
        {
            // initailize an array
            int[] array = {10, 25, 30, 46, 12};

            // Run loop to display array values with purposeful error
            try
            {
                for (int sub = 0; sub <= 10; ++sub)
                {
                    Console.WriteLine("{0} ", array[sub]);
                }
              
            }
            // Catch statement to catch eventual error
            catch(IndexOutOfRangeException)
            {
                Console.WriteLine("Now you have gone beyond the bounds of the array");
            }
        }
    }
}
