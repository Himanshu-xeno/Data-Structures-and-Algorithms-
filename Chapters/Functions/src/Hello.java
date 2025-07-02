public class Hello {
    public static void main(String[] args) {
        String message = greet("Himanshu Tiwari");
        System.out.println(message);
    }

    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
