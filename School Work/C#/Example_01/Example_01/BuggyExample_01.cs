﻿using System;

public class BuggyExample_01
{

    public static void Main()
    {

        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Snake s = new Snake();

        mankeThemTalk(a);
        Console.WriteLine():
        mankeThemTalk(d);
        Console.WriteLine();
        mankeThemTalk(c);
        Console.WriteLine();
        mankeThemTalk(s);
        Console.WriteLine();
    }

    public static void mankeThemTalk(Animal a)
    {

        if (a is Animal)
        {

            Console.WriteLine("I am an Animal");
        }

        if (a is Dog)
        {

            Console.WriteLine("I am a Dog");
        }

        if (a is Cat)
        {

            Console.WriteLine("I am a Cat");
        }

        if (a is Snake)
        {

            Console.WriteLine("I am a Snake");
        }
    }
}

public class Animal { }

public class cat : Animal { }

public class Dog : Animal { }

public class Snake : animal { }
