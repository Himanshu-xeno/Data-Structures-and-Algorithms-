//Innerrclass outside the main(outer class) {Top-level class}
//class Test {
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}



public class Static_InnerClass {
    static class Test {
        String name;

        //used for overriding the toString() method
        @Override
        public String toString() {
            return name;
        }

        public Test(String name) {
            this.name = name;
        }
    }



        public static void main(String[] args) {
            Test a = new Test("Kunal");
            Test b = new Test("Rahul");

            System.out.println(a.name);
            System.out.println(b.name);

            System.out.println(a);
        }
}
