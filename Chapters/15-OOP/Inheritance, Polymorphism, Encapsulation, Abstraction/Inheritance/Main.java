package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4);
//        Box box2 = new Box(3,4,5);
//        Box box3 = new Box(box2);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//        System.out.println(box3.l + " " + box3.w + " " + box3.h);
//
//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.l + " " + box4.weight);

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);

        //There are many variables in both parent and child classes
        //You are given access to variables that are in the ref. type i.e. BoxWeight
        //hence, you should have access to weight variable
        //This also means that the ones you are trying to access should be intialised
        //But here, when the obj itself is of type parent class, how will you call the constructor of child class

//        BoxWeight box6 = new box(2,3,4);
//        System.out.println(box6);
       //You can't have a child refernce variable and Parent object
    }
}
