package linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> linkedList = new DefaultDoublyLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.remove("C"));

        System.out.println(linkedList.toString());

    }
}
