/* Mitch Meyer
 * File Stream Example
 * 7/31/15
 * 
 */
 
using System;
using System.IO;

namespace CreateNameFile
{
    class CreateNameFile
    {
        static void Main()
        {
            // Create FileStream and StreamWriter to write to Names.txt
            FileStream file = new FileStream("Names.txt",
                FileMode.Create, FileAccess.Write);
            StreamWriter writer = new StreamWriter(file);

            // Create an array of names to be written
            string[] names = {
                                 "Anthony   ",
                                 "Belle     ",
                                 "Carolyn   ",
                                 "David     ",
                                 "Edwin     ",
                                 "Frannie   ",
                                 "Gina      ",
                                 "Hannah    ",
                                 "Inez      ",
                                 "Juan      "
                             };

            // Declare variable to use as an array subscript
            int x;
            // Write each name to the output file
            for (x = 0; x < names.Length; ++x)
                writer.WriteLine(names[x]);

            // Close StreamWriter and FileStream
            writer.Close();
            file.Close();

        }
    }
}
