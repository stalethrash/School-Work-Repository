/* Mitchell Meyer
 * 6/18/15
 * Buggy Program
 * Bellevue University
 * BuggyOddNumbers.cs
*/
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuggyOddNumbers
{
    class BuggyOddNumbers
    {
        static Void Main(string[] args)
        {
            // Define a count variable for table formatting
            int count = 0;
            // Set a for loop to determine and display odd numbers between 1 and 99
            for (int i = 1; i < 100; ++i)
            {
                if ((i / 2) != 0)
                {
                    Console.Write("{0, 4}", i);
                    ++count;
                }
                // If statement to limit table line length to 6 numbers
                if (count == 6)
                {
                    Console.WriteLine("");
                    count = 0
                }
            }
        }
    }
}
