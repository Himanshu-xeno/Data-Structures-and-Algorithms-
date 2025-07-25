//Number of Steps to Reduce a Number to zero
//If current number is even : divide by 2
//otherwise, subtract it by one to make it even => then divide by 2
//Do this till it reaches zero => then count the no. of steps to make it zero

public class StepsReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfStepsRecursive(123));
    }

    static int numberOfSteps(int n){
        //Initialised steps to count the number of steps
        int steps = 0;

        //Just keep this condition of while to keep running code until num > 0
        while(n > 0){
            if( n % 2 == 0 ){
                n = n /2;  //even
            }else{
                n = n - 1;  //odd
            }
            steps ++;       //increase it per step
        }
        return steps;
    }

    //Recursive method : optimal approach
    static int numberOfStepsRecursive(int n) {
        //Base condition
        if (n == 0) {
            return 0;
        }

        //Here we have added the 1 in return showing the steps
        if (n % 2 == 0) {
            return 1 + numberOfSteps(n / 2); //even
        } else {
            return 1 + numberOfSteps(n - 1); //odd
        }
    }
}
