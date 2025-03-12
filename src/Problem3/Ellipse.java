package Problem3;

public class Ellipse extends Shape {
    private String name;
    private double majorAxisA;
    private double minorAxisB;

    public Ellipse(String name, double majorAxisA, double minorAxisB) {
        this.name = name;
        this.majorAxisA = majorAxisA;
        this.minorAxisB = minorAxisB;
    }

    public String getName() {
        return name;
    }

    public double getMajorAxisA() {
        return majorAxisA;
    }

    public double getMinorAxisB() {
        return minorAxisB;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMajorAxisA(double majorAxisA) {
        this.majorAxisA = majorAxisA;
    }

    public void setMinorAxisB(double minorAxisB) {
        this.minorAxisB = minorAxisB;
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxisA * minorAxisB;
    }

    @Override
    public double getPerimeter() {
        if (majorAxisA == minorAxisB) {
            return 2 * Math.PI * majorAxisA;
        }
        return Math.PI * Math.sqrt(2 * (majorAxisA * majorAxisA + minorAxisB * minorAxisB) - ((majorAxisA - minorAxisB) * (majorAxisA - minorAxisB)) / 2);
    }

    @Override
    public String toString() {
        return "Ellipse [name=" + name + ", majorAxisA=" + majorAxisA + ", minorAxisB=" + minorAxisB + "]";
    }

}
