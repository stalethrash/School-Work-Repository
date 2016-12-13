public class Buggy {

    public static void main(String[] args) {

        // creates new rectangle objects
        MyRectangle myRectangle1 = new MyRectangle();  
        MyRectangle myRectangle2 = new MyRectangle();
        
        // setting values with mutators
        myRectangle1.setHeight(18.5);  
        myRectangle1.setWidth(5);
        myRectangle1.setColor("red");

        myRectangle2.setWidth(12);
        myRectangle2.setHeight(4);
        myRectangle2.setColor("yellow");
        
        System.out.println("Rectangle1");
        //accessors doing the getting below
        System.out.println("The color of this rectangle is " + myRectangle1.getColor()); 
        System.out.println("Width = " + myRectangle1.getWidth());
        System.out.println("Height = " + myRectangle1.getHeight());
        System.out.println("Area = " + myRectangle1.findArea());
        System.out.println("");
        System.out.println("Rectangle2");
        System.out.println("The color of this rectangle is " + myRectangle2.getColor());
        System.out.println("Width = " + myRectangle2.getWidth());
        System.out.println("Height = " + myRectangle2.getHeight());
        System.out.println("Area = " + myRectangle2.findArea());


    }
}

class MyRectangle {

    private double width = 1.0;     // Setting Start points for variables
    private double height = 1.0;
    private static String color = "white";

    public MyRectangle() { // Create a default rectangle object 

    }
// Create a rectangle object of specified parameters 
    public MyRectangle(double widthParam, double heightParam, String colorParam){
        width = widthParam;
        height = heightParam;
        color = colorParam;
    }

    public double getWidth() {
        return width;           // will return width parameters when called

    }

    public void setWidth(double widthParam) {
        width = widthParam;     // gives width the value of widthParam given by the call

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heightParam) {
        height = heightParam;
    }

    public String getColor() {
        return color;
    }

    public static void setColor(String colorParam) {
        color = colorParam;   
    }

    public double findArea() {
        return height * width;
    }
}
