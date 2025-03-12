package Problem2;

public class Demo {
    public static void main(String[] args) {

        Point point1 = new Point(4.0f, 1.8f);
        System.out.println("point1 Position: " + point1);

        MovablePoint point2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.75f);
        System.out.println("point2 Initial position: " + point2);

        point2.move();
        System.out.println("point2 After moving: " + point2);
    }
}
