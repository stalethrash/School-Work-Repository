/* Mitchell Meyer
 * 7/13/15
 * Assignment 6.2
 * Bellevue University
 * TapeDemo.cs
 *
 */
  
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TapeDemo
{
    class TapeDemo
    {
        static void Main(string[] args)
        {
            Tape aTape = new Tape();
            VideoCassetteTape vTape = new VideoCassetteTape();
            VideoCassetteTape xTape = new VideoCassetteTape();
            VideoCassetteTape yTape = new VideoCassetteTape();
            AdhesiveTape dTape = new AdhesiveTape();
            AdhesiveTape fTape = new AdhesiveTape();
            aTape.TapeWidth = 1.25;
            aTape.TapeLength = 35;
            vTape.TapeWidth = 2;
            vTape.TapeLength = 75;
            xTape.TapeWidth = 2;
            xTape.TapeLength = 144;
            dTape.TapeWidth = 3.5;
            dTape.TapeLength = 100;
            fTape.TapeWidth = 4;
            fTape.TapeLength = 100;
            vTape.PlayTime = -75;
            xTape.PlayTime = 244;
            yTape.PlayTime = 45;
            dTape.Stickiness = 14;
            fTape.Stickiness = 7;

            Console.WriteLine(aTape.ToString());
            Console.WriteLine(vTape.ToString());
            Console.WriteLine(xTape.ToString());
            Console.WriteLine(yTape.ToString());
            Console.WriteLine(dTape.ToString());
            Console.WriteLine(fTape.ToString());



        }
        public class Tape
        {
            private double tapeWidth;
            private double tapeLength;
            public double TapeWidth
            {
                get
                {
                    return tapeWidth;
                }
                set
                {
                    tapeWidth = value;
                }
            }
            public double TapeLength
            {
                get
                {
                    return tapeLength;
                }
                set 
                {
                    tapeLength = value;
                }
            }
            public Tape()
            {
                tapeWidth = 1;
                tapeLength = 1;
            }
            public override string ToString()
            {
                return (GetType() + "length of " + tapeLength + "width of " + tapeWidth);
            }
            

        }
        class VideoCassetteTape : Tape 
    {
        private int playTime;
        public int PlayTime
        {
            get
            {
                return playTime;
            }
            set
            {
                playTime = value;
                if (playTime <= 0)
                {
                    Console.WriteLine("Cassette tape play time impossible, length set to 1.");
                    playTime = 1;
                }
                if (playTime > 180)
                {
                    Console.WriteLine("Cassette tape play time impossible, legnth set to max of 180.");
                    playTime = 180;
                }
            }
        }
        public override string ToString()
        {
            return (GetType() + " width of " + TapeWidth + " length of " + TapeLength + " play time of "
                + playTime);
        }
    }
        class AdhesiveTape : Tape
        {
            private int stickiness;
            public int Stickiness
            {
                get
                {
                    return stickiness;
                }
                set
                {
                    stickiness = value;
                    if(stickiness <= 0)
                    {
                        Console.WriteLine("Adhesive tape is not sticky, set to minimum adhesive level of 1.");
                        stickiness = 1;
                    }
                    if(stickiness > 10)
                    {
                        Console.WriteLine("Adhesive tape impossibly sticky, set to maximum level of 10.");
                        stickiness = 10;
                    }
                }
            }
            public override string ToString()
            {
                return (GetType() + " width of " + TapeWidth + " length of " + TapeLength + " stickiness of "
                + stickiness);
            }
        }
    
        

    }
}

