There is one line in error:

//Save as Vehicle.java

public abstract class Vehicle

{

                private String powerSource;

                private int wheels;

                protected int price;

                public Vehicle(String powerSource, int wheels)

                {

                                setPowerSource(powerSource);

                                setWheels(wheels);

                                setPrice();

                }

                public String getPowerSource()

                {

                                return powerSource;

                }

                public int getWheels()

                {

                                return wheels;

                }

                public int getPrice()

                {

                                return price;

                }

                public void setPowerSource(String source)

                {

                                powerSource = source;

                }

                public void setWheels(int wls)

                {

                                wheels = wls;

                }

                public void setPrice(int retail)
                {
                    price = retail;
                }

}

//Save as Sailboat.java

import javax.swing.*;

public class Sailboat extends Vehicle

{

                private int length;

                public Sailboat()

                {

                                super("wind",0);

                                setLength();

                }

                public void setLength()

                {

                                String entry;

                                entry = JOptionPane.showInputDialog(null,"Enter sailboat length in feet ");

                                length = Integer.parseInt(entry);

                }

                public int getLength()

                {

                                return length;

                }

                public void setPrice()

                {

                                String entry;

                                final int MAX = 100000;

                                entry = JOptionPane.showInputDialog(null,"Enter sailboat price ");

                                price = Integer.parseInt(entry);

                                if(price > MAX)

                                                price = MAX;

                }

                public String toString()

                {

                                return("The " + getLength() + " foot sailboat is powered by " + getPowerSource() +

                                                "; it has " + getWheels() + " wheels and costs $" + getPrice());

                }

}

//Save as Bicycle.java

import javax.swing.*;

public class Bicycle extends Vehicle

{

                public Bicycle()

                {

                                super("a person", 2);

                }

                public void setPrice()

                {

                                String entry;

                                final int MAX = 4000;

                                entry = JOptionPane.showInputDialog(null,"Enter bicycle price ");

                                price = Integer.parseInt(entry);

                                if(price > MAX)

                                                price = MAX;

                }

                public String toString()

                {

                                return("The bicycle is powered by " + getPowerSource() +

                                                "; it has " + getWheels() + " wheels and costs $" + getPrice());

                }

}

//Save as DemoVehicles.java

import javax.swing.*;

public class DemoVehicles

{

                public static void main(String[] args)

                {

                                Vehicle aVehicle = new Vehicle();

Sailboat aBoat = new Sailboat();

                                Bicycle aBike = new Bicycle();

                                JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" + aBoat.toString() +

                                                "\n" + aBike.toString());

                }

}