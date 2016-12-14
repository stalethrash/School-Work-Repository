using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuggyCarpetShop
{
    class BuggyCarpetShop
    {
        public static void Main()
        {
            Carpet aRug = new Carpet();
            aRug.Width - 12;
            aRug.Length = 14;

            Carpet bRug = new Carpet(24, 10);

            Display{aRug};
            Display(bRug);
        }                    
        public static void Display(Carpet car)
        {
            Console.Write("The {0} x {1} carpet ", car.Width, car.Length);
            Console.WriteLine("has an area of {0}", car.Area);
            Console.WriteLine("Our Motto is: {0}", Carpet.MOTTO):
        }
        public class Carpet 
        {
            public const string MOTTO = "Our carpets are quality-made.";
            private int length;
            private int width;
            private int area;
            public int Length
            {
                get
                {
                    return length;
                }
                set
                {
                    length = value;
                    CalcArea();
                }
            }
            public int Width
            {
                get
                {
                    return width;
                }
                set
                {
                    width = value;
                    CalcArea();
                }
            }
            public int Area
            {
                get
                {
                    return area;
                }
            }
            private void CalcArea()
            {
                area = Length * Width;
            }
            public Carpet(int lnth, int wth)
            {
                length = lnth;
                width = wth;
                
            }
            public Carpet()
            {
                length = 0;
                width = 0;
            }
        
        }
    }
}

