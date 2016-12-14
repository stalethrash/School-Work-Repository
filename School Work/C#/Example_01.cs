using System;
using System.Windows.Forms;

public class Example_01 : Form
{

    public Example_01()
    {
        Text = "Window Title";
    }
    

    public static void Main()
    {
        Example_01 example = new Example_01();
        Application.Run(example);
    }
}

