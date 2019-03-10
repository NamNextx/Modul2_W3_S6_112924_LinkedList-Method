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
        ll.addLast(8);
        ll.addFirst(0);
        ll.remove(2);
       // ll.addFirst(100);
        ll.printList();


        System.out.println(ll.get(2));
        System.out.println(ll.getLast());
        System.out.println(ll.getSize());
    }
}
