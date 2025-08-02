package Inheritance;

public class Box {
    double l;
    double h;
    double w;

    //When no parameters given
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //When one parameter is given
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    //When three parameter is given
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
