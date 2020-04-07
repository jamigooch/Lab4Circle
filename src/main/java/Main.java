
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //New Class
        CircleClass CircleSample = new CircleClass();
        CircleSample.SetRadius(0);

    Scanner keyboard = new Scanner(System.in);

    //Radius
        System.out.println("Please input Radius.");
        double Radius = keyboard.nextDouble();
        CircleSample.SetRadius(Radius);
        System.out.println("Radius is " + Radius);

    //Area
        double Area = CircleSample.GetArea();
        System.out.println("Area is " + Area);

    //Diameter
        double Diameter = CircleSample.GetDiameter();
        System.out.println("Diameter is " + Diameter);

    //Circumference
        double Circumference = CircleSample.GetCircumference();
        System.out.println("Circumference is " + Circumference);
    }

}
