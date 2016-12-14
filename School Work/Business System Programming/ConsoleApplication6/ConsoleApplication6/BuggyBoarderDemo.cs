using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication6
{
    class BuggyBoarderDemo
    {
        static void Main()
        {
            DisplayWithBorder('Ed');
            DisplayWithBorder("Theodore");
            DisplayWithBorder("Jennifer Ann");
        }
        private static void DisplayWithBorder(string word)
        {
            const int EXTRA_STARS = 4;
            const string SYMBOL = "*";
            int size = word.Length + EXTRA_STARS;
            int x:

            for (x = 0; x < size; ++x)
                Console.Write(SYMBOL);
            Console,WriteLine();
            Console.WriteLine(SYMBOL + " " + Word + " " + SYMBOL);
            for (x = 0; x < size; ++x)
                Console.Write(SYMBOL);
            Console.WriteLine("\n\n");
                    
        
    }
}
