package D_InPlaceReversalOfLinkedList.ReverseLinkedListII;

import A_Two_Pointers.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null || left == right) return head;

        ListNode previous = null;
        ListNode current = head;
        int i = 1;

        while( current != null && i != left){
            previous = current;
            current = current.next;
            i++;
        }

        ListNode start = current;
        ListNode pointerToStart = previous;
        previous = null;
        while(current != null && i != right + 1){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }

        start.next = current;
        if(pointerToStart != null){
            pointerToStart.next = previous;
        } else {
            return previous;
        }

        return head;
    }
}
