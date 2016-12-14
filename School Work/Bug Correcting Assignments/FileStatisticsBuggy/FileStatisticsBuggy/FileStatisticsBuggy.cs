using System;
using System.IO;

namespace FileStatisticsBuggy
{
    class FileStatisticsBuggy
    {
        static void Main()
        {
            // File must be in the same directory as the program.
            string fileName;
            Console.WriteLine("Enter a filename >> ");
            fileName = Console.ReadLine();
            if (File.Exists(fileName))
            {
                Console.WriteLine("File exists");
                Console.WriteLine("File was created " +
                    FileGetCreationTime(fileName));
                Console.WriteLine("File was last accessed " +
                    File.GetLastAccessTime(fileName));
                Console.WriteLine("File was last written to " 
                    File.GetLastWriteTime(fileName));
            }
            else
                Console.WriteLine("File does not exists")
        }
    }
}
