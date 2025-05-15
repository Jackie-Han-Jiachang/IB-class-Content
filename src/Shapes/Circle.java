package Shapes;

public class Circle {

    private double radius;

    Circle() {
        radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

}
