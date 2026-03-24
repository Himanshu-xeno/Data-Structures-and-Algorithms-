//This code is about the Inroduction of Linked List
//It tells us how they are formed using classes and objects and accessed using constructors
//We have considered arrays to simulate input data


class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Intro{
    public static void main(String[] args) {
        //Create an array
        int[] arr = {2,3,4,5};

//        //Create first Node
//        Node y = new Node(arr[0]);
//
//        //Print memory reference of node
//        System.out.println(y);
//
//        //Print data stored in node
//        System.out.println(y.data);

        //Create LL manually
        Node head = new Node(arr[0]);
        Node second = new Node(arr[1]);
        Node third = new Node(arr[2]);
        Node fourth = new Node(arr[3]);

        //Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        //Print full list
        printList(head);
    }

    //function to print List
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

