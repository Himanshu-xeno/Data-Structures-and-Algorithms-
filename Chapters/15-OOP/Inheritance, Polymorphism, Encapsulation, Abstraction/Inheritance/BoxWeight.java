package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }


    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //What is this? Call the parent class constructor
        //Use to intialize values present in parent class constructor
        //But it can't access the privately initialised valuess
        this.weight = weight;
    }
}


//Object class is parent class for all classses in java, whatever we create
//everything inherit from this Object class in java

//super is used to access explicitly something from super class(Parent class)
//even if the names of them are same