package A_LinkedList.CustomLinkedList;

public class LinkedList {

    public Node head;
    public Integer size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertLast(int value){

        Node node = new Node(value);

        if(head == null){
            head = node;
        } else {
            Node lastNode = traversalOfNodeToFindOutLastNode(head);
            lastNode.nextNode = node;
        }

        size = size + 1;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
        } else {
            node.nextNode = head;
            head = node;
        }

        size = size + 1;

    }

    public void insertAtSpecifiedIndex(int value, int index){

        if(index == 0){
            insertFirst(value);
        } else if (index == this.size+1) {
            insertLast(value);
        }

        Node node = new Node(value);
        Node indexSpecifiedNode = traversalToSpecifiedIndex(index);
        node.nextNode = indexSpecifiedNode.nextNode;
        indexSpecifiedNode.nextNode = node;

        size = size + 1;

    }

    public void deleteFirst(){
        head =  head.nextNode;
        size = size - 1;
    }

    public void deleteLast(){
        Node secondLastnode = traversalToSpecifiedIndex(this.size);
        secondLastnode.nextNode = null;
        this.size = size - 1;
    }

    public void deleteAtSpecifiedIndex(int index){
        if(index == 0 ){
            deleteFirst();
        } else if (index == size){
            deleteLast();
        }

        Node previousIndexOfSpecifiedIndex = traversalToSpecifiedIndex(index);
        previousIndexOfSpecifiedIndex.nextNode = previousIndexOfSpecifiedIndex.nextNode.nextNode;
    }

    public Node traversalToSpecifiedIndex(int index){
        int counter = 1;
        Node temporaryHead = this.head;

        while(temporaryHead.nextNode != null){
            if(counter == index -1) return temporaryHead;
            temporaryHead = temporaryHead.nextNode;
            counter = counter + 1;
        }

        return temporaryHead;
    }

    public Node traversalOfNodeToFindOutLastNode(Node node){
        while(node.nextNode != null){
            node = node.nextNode;
        }

        return node;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.nextNode;
        }

        result.append("null");
        return result.toString();
    }

}
