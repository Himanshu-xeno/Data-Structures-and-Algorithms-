public class Main_StaticVariables {
    public static void main(String[] args) {
        Human_StaticVariables person1 = new Human_StaticVariables(20,"Himanshu", 200000, false);
        Human_StaticVariables person2 = new Human_StaticVariables(17,"Roshan", 20000, false);
        Human_StaticVariables person3 = new Human_StaticVariables(15,"Taniya", 20000, false);
        Human_StaticVariables person4 = new Human_StaticVariables(23,"Sakshi", 20000, true);
        Human_StaticVariables person5 = new Human_StaticVariables(16,"Shashikant", 20000, false);
        Human_StaticVariables person6 = new Human_StaticVariables(21,"Ravikant", 20000, false);


        System.out.println(person1.name);
        System.out.println(person2.salary);
        System.out.println(person2.name);
        System.out.println(person6.name);
        System.out.println(person1.age);

        System.out.println(Human_StaticVariables.population);  //static variable
    }
}
