public class ConstructorOverloading_2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(10, 20, 30);

        b1.display();
        b2.display();
        b3.display();
    }
}

    class Box{
        int length ;
        int width ;
        int height ;

        //Constructor 1 : No parameter
        Box(){
            length = width = height = 0;
        }

        //COnstructor 2 : One parameter
        Box(int side){
            length = width = height = side;
        }

        //COnstructor 3 : Two parameter
        Box(int l, int w, int h){
            length = l;
            width = w;
            height = h;
        }

        void display(){
            System.out.println("L = " + length + " W = " + width + " H = " + height);
        }
    }

