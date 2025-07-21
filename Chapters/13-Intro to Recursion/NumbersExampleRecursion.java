//Write a function which takes in a number and prints it
//Print the first 5 numbers : 1,2,3,4,5

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);

        //This is called Tail-recursion - this is the last function call itself
        print(n+1);
    }
}
