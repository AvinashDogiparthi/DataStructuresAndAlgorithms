package A_LinkedList.A_Introduction;

import java.util.Iterator;
import java.util.LinkedList;

public class A_WorkingWithBuildInLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);

        // Add element at the beginning
        list.addFirst("Apricot");
        System.out.println("After addFirst: " + list);

        // Add element at the end
        list.addLast("Date");
        System.out.println("After addLast: " + list);

        // Add element at a specific index
        list.add(2, "Blueberry");
        System.out.println("After add at index 2: " + list);

        // Get elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

        // Check if list contains an element
        System.out.println("Contains 'Cherry'? " + list.contains("Cherry"));

        // Remove elements
        list.removeFirst();  // Remove first
        list.removeLast();   // Remove last
        list.remove("Blueberry");  // Remove specific object
        list.remove(1);  // Remove at index
        System.out.println("After removals: " + list);

        // Replace element at specific index
        list.set(1, "Blackberry");
        System.out.println("After set at index 1: " + list);

        // Get index of an element
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));

        // Iterate using for-each loop
        System.out.println("Iterating using for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Iterate using iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clear the list
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
