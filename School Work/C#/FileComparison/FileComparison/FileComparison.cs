/* Mitchell Meyer
 * 7/31/15
 * Assignement 9.3
 * Bellevue University
 * FileComparison.cs
 * 
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;


namespace FileComparison
{
    class FileComparison
    {
        static void Main()
        {
            // Declare file name strings
            string txtFile = "Quote.txt";
            string docFile = "Quote.doc";

            // create FileInfo objects and determine and output file size
            FileInfo txtInfo = new FileInfo(txtFile);
            Console.WriteLine(txtFile + " is " + txtInfo.Length + " bytes");

            FileInfo wordInfo = new FileInfo(docFile);
            Console.WriteLine(docFile + " is " + wordInfo.Length + " bytes");

            //Declare variables to calculate file size ratios
            double txtLength = Convert.ToDouble(txtInfo.Length);
            double docLength = Convert.ToDouble(wordInfo.Length);

            // Output ratios of .doc and .txt files
            Console.WriteLine("The ratio of " + txtFile + "to " + docFile + " is\n "
                + (txtLength / docLength));
            Console.WriteLine("The ratio of " + docFile + "to " + txtFile + " is\n "
                + (docLength / txtLength));
        }
    }
}
