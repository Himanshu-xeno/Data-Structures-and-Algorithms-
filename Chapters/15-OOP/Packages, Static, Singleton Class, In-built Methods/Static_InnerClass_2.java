public class Static_InnerClass_2 {
    static class Test{
        static String message = "Static Inner Class";

        static void showMessage() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //static inner-class can access static stuff directly => no need to object
        Static_InnerClass_2.Test.showMessage();
    }
}

//No object needed - just use Static_InnerClass_2.Test.