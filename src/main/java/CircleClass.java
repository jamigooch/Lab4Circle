
public class CircleClass {
    
//Fields
    public double Radius;
    public double Pi = 3.14159;

//Methods
    public double Area;
    public double Diameter;
    public double Circumference;

//Radius
    public void SetRadius(double Radius) {
        this.Radius = Radius;
    }

    public double GetRadius() {
        return Radius;
    }

//Area
    public double GetArea() {
        this.Area = Pi * Radius * Radius;
        return Area;
    }

//Diameter
    public double GetDiameter() {
        this.Diameter = Radius * 2;
        return Diameter;
    }

//Circumference
    public double GetCircumference() {
        this.Circumference = 2 * Pi * Radius;
        return Circumference;
    }

}
