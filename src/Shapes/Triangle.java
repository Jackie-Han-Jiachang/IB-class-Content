package Shapes;

import static java.lang.Math.*;

public class Triangle {


    private double base;
    private double leftSide;
    private double rightSide;

    Triangle(double base, double leftSide, double rightSide){ //constructor
        this.base = base;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    Triangle(){
        base = 1;
        leftSide = 1;
        rightSide = 1;
    }

//    public void setBase(double a){
//        if (a < 0){
//            IBIO.output("Error");
//        }else{
//            this.base = a;
//        }
//    }
//    public void setLeftSide(double a){
//        if (a < 0){
//            IBIO.output("Error");
//        }else{
//            this.leftSide = a;
//        }
//    }
//
//    public void setRightSide(double a){
//        if (a < 0){
//            IBIO.output("Error");
//        }else{
//            this.rightSide = a;
//        }
//    }


    public double getBase() {
        return base;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getArea(){
        double p = (base + leftSide + rightSide)/2;
        return Math.sqrt(p * (p - base) * (p - rightSide) * (p - leftSide));
    }

    public double getPerimeter(){
        return base + leftSide + rightSide;
    }

    public double getHeight(){
        Triangle tri = new Triangle();
        tri.leftSide = this.leftSide;
        tri.rightSide = this.rightSide;
        tri.base = this.base;
        return (2 * tri.getArea())/base;
    }

    public double getRightAngle(){
        Triangle tri = new Triangle();
        tri.leftSide = this.leftSide;
        tri.rightSide = this.rightSide;
        tri.base = this.base;
        double h = tri.getHeight();
        if (h == rightSide){
            return 90.0;
        }
        return 180 * Math.asin(h / rightSide) * (1/ PI);
    }

    public double getLeftAngle(){

        Triangle tri = new Triangle();
        tri.leftSide = this.leftSide;
        tri.rightSide = this.rightSide;
        tri.base = this.base;
        double h = tri.getHeight();
        if ( h == leftSide){
            return 90.0;
        }
        return 180 * Math.asin(h/leftSide) * (1/ PI);
    }

    public double getTopAngle(){
        Triangle tri = new Triangle();
        tri.leftSide = this.leftSide;
        tri.rightSide = this.rightSide;
        tri.base = this.base;
        double h = tri.getHeight();
        return 180 - 180 * Math.asin(h/leftSide) * (1/ PI) - 180 * Math.asin(h/rightSide) * (1/ PI);

    }
}
