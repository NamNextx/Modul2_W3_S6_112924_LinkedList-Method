public class MyLinkedList {
    private Node head;
    private int numNodes = 1;

    class Node {
        private Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast(){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }


    public void remove(int index) {
        if (index < 0 || index>numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of ranger");
        }
        else {
            Node temp = head;

            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }


    }

    public int getSize() {
        return numNodes;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
