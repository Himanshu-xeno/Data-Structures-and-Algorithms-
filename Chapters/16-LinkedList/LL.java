public class LL {

        private Node head;
        private Node tail;

        private int size;

        public LL() {
            this.size = 0;
        }

        //Insetion at first code
        public void insertFirst(int val){
            Node node = new Node(val);  //create a new node(box)
            node.next = head;   //Point the head of new node to current head
            head = node;

            if(tail == null){
                tail = head;
            }

            size += 1;
        }

        //Insertion at last
        public void insertLast(int val){
            if(tail == null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size ++;
        }

        //Insert at any index
        //head->10->20->30->40->50->null
    public void insert(int val, int index){
            if(index == 0){
                insertFirst(val);
                return;
            }
            if(index == size){
                insertLast(val);
                return;
            }
            //To insert at 2, stand at 1
            //use temp to move as we should not move head
            Node temp = head;   //head = temp = 10 : move forward
            for (int i = 1; i < index; i++) {
                temp = temp.next;   //stop at (i-1) : 1(20)
                                    //20->30 {temp.next=30}(this is basic understanding)
            }
            Node node = new Node(val, temp.next);   //Use of the constructor below
            //node = 99 -> 30
            temp.next = node;   //Change 20.next = 99 -> 30

            size ++;
    }

    //------------------------------------------------------------------------------------------------------------------

    //Delete at First
    public int deleteFirst(){
            int val = head.value;
            head = head.next;
            if(head == null){
                tail = null;
            }
            size --;
            return val;
    }

    //Delete Last Element
    public Node get(int index){
            Node node = head;
            for(int i=0; i< index; i++){
                node = node.next;
            }
            return node;
    }

    public int deleteLast(){
            if(size <= 1){
                return deleteFirst();
            }
            Node secondLast = get(size-2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null;
            size --;

            return val;
    }

    //-----------------------------------------------------------------------------------------------------------------

    public void display(){
            Node temp = head;   //Pointing to head
            while(temp != null){
                System.out.print (temp.value + " -> ");
                temp = temp.next; //Move ahead
            }
            System.out.println("END");
        }

    private class Node{
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
    }
}
