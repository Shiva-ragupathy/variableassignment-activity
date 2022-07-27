package Module5;

public class AbstractActivity {
    public static void main(String args[]) {
        // set and Print color of rectangle
        Shape rectangle = new Rectangle();
        rectangle.setColor("Red");
        System.out.println("The color of the rectangle is "+rectangle.getColor());
        rectangle.setLength(14);
        rectangle.setBreadth(22);
        System.out.println("The area of the rectangle is "+rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is "+rectangle.calculatePerimeter());

        Shape circle = new Circle();
        circle.setColor("yellow");
        System.out.println("The color of the circle is "+circle.getColor());
        circle.setRadius(14);
        System.out.println("The area of the circle is "+circle.calculateArea());
        System.out.println("The perimeter of the circle is "+circle.calculatePerimeter());

    }
}

