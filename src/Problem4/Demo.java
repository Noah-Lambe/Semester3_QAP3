package Problem4;

public class Demo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Ellipse("Ellipse1", 8.0, 4.0);
        shapes[1] = new Circle("Circle1", 5.0);
        shapes[2] = new Triangle("Triangle1", 5.0, 3.0, 2.5);
        shapes[3] = new EquilateralTriangle("Triangle2", 4.0, 4.0, 4.0);

        double factor = 1.5;

        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape);
            System.out.println(shape.getName() + " Area: " + String.format("%.2f", shape.getArea()));
            System.out.println(shape.getName() + " Perimeter: " + String.format("%.2f", shape.getPerimeter()));
            shape.scale(factor);
            System.out.println("Scaled by " + factor);
            System.out.println(shape.getName() + " Scaled Area: " + String.format("%.2f", shape.getArea()));
            System.out.println(shape.getName() + " Scaled Perimeter: " + String.format("%.2f", shape.getPerimeter()));
        }
    }
}
