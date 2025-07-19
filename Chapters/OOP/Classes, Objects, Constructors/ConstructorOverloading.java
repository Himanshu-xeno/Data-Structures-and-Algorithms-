public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student(); // uses constructor 1
        Student s2 = new Student("Alice"); // uses constructor 2
        Student s3 = new Student("Bob", 20); // uses constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
    String name;
    int age;

    // Constructor 1 : No paramenters
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2 : One parameter
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3 : Two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
