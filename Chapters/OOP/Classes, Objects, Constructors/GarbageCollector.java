public class GarbageCollector {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000000; i++) {
            GarbageCollector obj = new GarbageCollector(); // Object created
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object is deleted by GC.");
    }
}
