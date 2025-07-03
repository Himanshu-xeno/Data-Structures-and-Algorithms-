public class SumOfN_numbers {
    public static void main(String[] args) {
        //int n = 5;
        //func(n, 0);
        int result = func2(5); // Output should be 15
        System.out.println(result);
    }

    //Parameterized way
    static void func(int i, int sum){
        //base condition
        if(i < 1){
            System.out.println(sum);
            return;
        }

        //increment sum by i till i decrements to 1
        func(i-1 , sum+i);
    }

    //functional way
    static int func2(int n){
        if(n == 0){
            return 0;
        }
        return n + func2(n - 1);
    }
}
