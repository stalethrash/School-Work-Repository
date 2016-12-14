using System;

public delegate void EventHandler();

class Program
{
    public static event EventHandler show;

    static void Main()
    {
        // Add event handlers to Show event.
        show += new EventHandler(Dog);
        show += new EventHandler(Cat);
        show += new EventHandler(Mouse);

        // Invoke the event.
        show.Invoke();

    }      
    static void Cat()
    {
	Console.WriteLine("Cat");
    }

    static void Dog()
    {
	Console.WriteLine("Dog");
    }

    static void Mouse()
    {
	Console.WriteLine("Mouse");
    }
}
