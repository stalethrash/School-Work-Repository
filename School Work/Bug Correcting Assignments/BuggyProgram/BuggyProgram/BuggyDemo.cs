using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DisplaySomeMoney.BuggyProgramms
{
    class BuggyDemo
    {
        static void Main()
        {
            int anInt = -123;
            uint anUnsignedInt = 567;
            Console.WriteLine("The int is {0} and the unsigned int is {1}.", anInt, anUnsignedInt);

        }

    }
}
