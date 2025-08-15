package D_InPlaceReversalOfLinkedList.ReverseALinkedList;

import A_Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode previous = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }

        return previous;
    }
}
