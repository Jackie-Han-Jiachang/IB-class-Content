package Shapes;

public class Rectangle{

    //state (usually private)
    //Encapsulation: the practice of hiding the structure and representation of data within a class and make it accessible
    //outside that class via accessor functions. (keeping all state variables private.)
    //we can't change everything whatever we want, so that we can avoid some bugs.
    private int height;
    private int width;

    //methods
    //Constructor : set default.
    Rectangle(){
        width = 2;
        height = 4;
    }

    Rectangle(int h, int w){
        this.width = h;
        this.height = w;
    }

    //setter (mutator)
    //allows us to change the width field from another class.
    void setWidth(int a){
        if (a < 0){
            IBIO.output("Error");
        }else {
            this.width = a;
        }
    }

    void setHeight(int a){
        this.height = a;
    }

    // getter (accessor)
    //allows us to retrieve the width instance variable form another class)
    public int getArea(){
        return height * width;
    }

    public int getPerimeter(){
        return (height + width) * 2;
    }
}
