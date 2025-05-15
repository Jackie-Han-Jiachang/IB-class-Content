package Shapes;

import Shapes.Rectangle;

public class ShapeCalculator {
    // static : used to declare class-level variables and methods that belong to the class itself.
    public static void main(String[] args){

//        Shapes.Triangle t = new Shapes.Triangle();
//        t.rightSide = 2;// IBIO class does not have an object, because it has "static"
//        t.leftSide = 2;
//        t.base = 1;
//        Shapes.Triangle s = t;
//        t.base = 3;
//        IBIO.output(t.getLeftAngle());

        Rectangle r  = new Rectangle(5,4);
        //why is better to use parameters?
        //1 -> we can force the user to provide defaults.
        //2 -> the user of my class doesn't need to refer to its state variables.
        r.setHeight(-1000);
        // we can control everything(what can be set, what can be compiled) in one class
        IBIO.output(r.getPerimeter());
    }
}
