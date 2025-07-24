public class Main_StaticMethods {
    public static void main(String[] args) {

    }

    //We can't use non static method in static method
    static void fun(){
        //greeting(); // I can't use it because it requires instance
        //but function where it is kept doesn't depend on any object(instances)


        //You can't access non-static stuff without referencing their instances in a static context
        //Hence, I am referencing it here
        Main_StaticMethods obj = new Main_StaticMethods();
        obj.greeting();
    }

    //We know that something which is not static => belongs to object(instance)
    void greeting(){
        System.out.println("Hello world");
    }
}
