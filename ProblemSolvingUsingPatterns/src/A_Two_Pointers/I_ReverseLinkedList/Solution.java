package A_Two_Pointers_Pattern.I_ReverseLinkedList;

import A_Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode current = head;
        ListNode previous = null;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;

            current = nextNode;
        }

        return previous;
    }
}
