package A_Two_Pointers.M_PalindromeLinkedList;

import A_Two_Pointers.D_Remove_Duplicate_LinkedList.ListNode;

public class ComparingReversedLinekdListWithMainOne {

    public boolean isPalindrome(ListNode head) {
        ListNode tempNode = head;
        ListNode reverseNode = reverseLinkedList(copyList(tempNode));

        while(head != null){
            if(reverseNode.val != head.val){
                return false;
            }

            reverseNode = reverseNode.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head){

        ListNode previous = null;

        while(head != null){
            ListNode nextNode = head.next;
            head.next = previous;

            previous = head;
            head = nextNode;
        }

        return previous;
    }

    private ListNode copyList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        head = head.next;
        while (head != null) {
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }
        return newHead;
    }
}
