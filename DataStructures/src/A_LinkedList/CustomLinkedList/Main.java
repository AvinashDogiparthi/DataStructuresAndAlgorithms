package A_LinkedList.CustomLinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(10);
        list.insertLast(12);
        list.insertFirst(2);
        list.insertFirst(3);
        System.out.println(list);
        list.insertAtSpecifiedIndex(20,2);
        System.out.println(list);

        list.deleteFirst();
        System.out.println(list);
        list.deleteLast();
        System.out.println(list);

        list.insertLast(30);
        list.insertAtSpecifiedIndex(25,3);
        System.out.println(list);

        list.deleteAtSpecifiedIndex(3);
        System.out.println(list);
    }
}
