//Tmyers 6.1 Thread 2 
//Buggy Program

using System;

namespace Buggy6_1
{
    class DemoObjectInitializer
    {
        static void Main()
        {
            Employee aWorker = new Employee { IDNumber = 101 };
            Console.WriteLine("Employee #{0} exists.  Salary is {1}.",
                aWorker.IDNumber, aWorker.Salary);
        }
        class Employee
        {
            public int IDNumber { get; set; }
            public double Salary { get; set; }
            public Employee()
            {
                Salary = 99.99;
                Console.WriteLine("Employee #{0} created.  Salary is {1}.",
                    IDNumber, Salary);
            }
        }
    }

}
