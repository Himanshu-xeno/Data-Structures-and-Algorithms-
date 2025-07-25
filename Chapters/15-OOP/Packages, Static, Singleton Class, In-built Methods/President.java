public class President  {
    private static President instance;

    private President(){
        // 🔒 private constructor prevents external instantiation
    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President(); // ✅ creates only once
        }
        return instance;
    }


    public static void main(String[] args) {
        President p1 = President.getInstance();
        President p2 = President.getInstance();

        System.out.println(p1 == p2);  // ✅ true: both refer to the same object

    }
}
