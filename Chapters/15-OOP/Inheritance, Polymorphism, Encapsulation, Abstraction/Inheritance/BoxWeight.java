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
