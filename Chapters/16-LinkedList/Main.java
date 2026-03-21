public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);

        list.insertLast(99);

        System.out.println(list.deleteFirst());
        list.insertFirst(8);
        list.insert(102, 3);
        list.display();
        list.delete(3);
        list.display();

        // Printing the value find by the find method
        // Node found = list.find(99); --> We can't use the Node class here because it's
        // private, so we need to change the find method to return the value instead of
        // the node.
        int found = list.find(99);
        if (found != -1) {
            System.out.println(found);
        } else {
            System.out.println("Value not found in the list.");
        }

    }
}
