/* Mitch Meyer
 * 7/2/15
 * Assignemnt 5.1
 * Bellevue University
 * HungarianNotationDemo.cs
 * 
*/ 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HungarianNotationDemo
{
    class HungarianNotationDemo
    {
        static void Main(string[] args)
        {
            int inX;  //  Systems Hungarian notation - useless

            int ctX;  // Apps Hungarian notation - ct a count variable

            inX = 5;

            for (ctX = 0; ctX < inX; ++ctX)
            {
                for (int ctY = 0; ctY < ctX; ctY++)
                    // ctY is also a count variable
                    Console.Write("*\t");
                Console.WriteLine("");
            }
        }
    }
}
