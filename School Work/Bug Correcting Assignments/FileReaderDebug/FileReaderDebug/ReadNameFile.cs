using System;
using System.IO;

public class ReadNameFile
{
    public static void Main()
    {
        FileStream file = new FileStream("Names.txt", FileMode.Open, FileAccess.Read);
        StreamReader reader = new StreamReader(file);
        int count = 1;
        string name;
        Console.WriteLine("Displaying all names");
        name = reader.ReadLine();

        while (name != null)
        {
            Console.WriteLine("" + count + " " + name);
            name = reader.ReadLine();
            ++count;
        }

        reader.Close();
        file.Close();
    }
}
