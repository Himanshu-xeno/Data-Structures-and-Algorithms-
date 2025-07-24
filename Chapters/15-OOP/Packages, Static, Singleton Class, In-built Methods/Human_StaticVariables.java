public class Human_StaticVariables {
    int age;
    String name;
    int salary;
    boolean married;

    static long population; //static variable

    public Human_StaticVariables(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human_StaticVariables.population += 1;  //Updating the static variable
    }
}
