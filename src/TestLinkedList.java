public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(6);
        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.add(2,3);
        ll.add(3,4);
        ll.addLast(7);
        ll.addFirst(0);
        ll.addFirst(100);
        ll.printList();
    }
}
