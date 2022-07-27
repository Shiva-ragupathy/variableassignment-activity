package Module5;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    public double calculateArea()
    {
        return this.length*this.breadth;
    }
    public double calculatePerimeter()
    {
        return this.length+this.breadth*2;
    }
}


