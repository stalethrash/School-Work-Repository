/* Mitchell Meyer
 * 7/6/15
 * Assignment 5.2
 * Bellevue University
 * DemoScouts.cs
 *
 */
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoScouts
{
    class DemoScouts
    {
        static void Main()
        {
            // Instantiate two girl scout objects and employe display method
            GirlScout Jamie = new GirlScout();
            GirlScout Amanda = new GirlScout("Amanda Meyer", "Meyer Troop", 45.50);
            Display(Jamie);
            Display(Amanda);

        }
        // Method for displaying GirlScout object fields
        public static void Display(GirlScout scout)
        {
            Console.WriteLine("{0,5}    {1, -10} {2,6}\n{3}", 
                scout.ScoutName, scout.TroopName,
                scout.DuesOwed.ToString("C2"), GirlScout.MOTTO);
        }
        // Create Girlscout Object
        public class GirlScout
        {
            // Object fields
            private string scoutName;
            private string troopName;
            private double duesOwed;
            // Static motto field
            public const string MOTTO = "to obey the Girl Scout Law.";
            // Set field properties
            public string ScoutName
            {
                get
                {
                    return scoutName;
                }
                set
                {
                    scoutName = value;
                }
            }
            public string TroopName
            {
                get
                {
                    return troopName;
                }
                set
                {
                    troopName = value;

                }
            }
            public double DuesOwed
            {
                get
                {
                    return duesOwed;
                }
                set
                {
                    duesOwed = value;
                }
            }
            // Default object constructor
            public GirlScout()
            {
                scoutName = "Jamie Quinn";
                troopName = "Air Comm Scouts";
                duesOwed = 0;
                               
            }
            // Overloaded constructors
            public GirlScout(string userName)
            {
                scoutName = userName;
                troopName = "Air Comm Scouts";
                duesOwed = 0;
            }
            public GirlScout(string userName, string userTroop)
            {
                scoutName = userName;
                troopName = userTroop;
                duesOwed = 0;
            }
            public GirlScout(string userName, string userTroop, double userDues)
            {
                scoutName = userName;
                troopName = userTroop;
                duesOwed = userDues;
            }
            }
        
        }
    }
