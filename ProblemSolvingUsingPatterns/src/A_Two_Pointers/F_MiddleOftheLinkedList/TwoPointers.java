package A_Two_Pointers.F_MiddleOftheLinkedList;

import A_Two_Pointers.D_Remove_Duplicate_LinkedList.ListNode;

public class TwoPointers {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = head.next;
            fast = head.next.next;
        }

        return slow;
    }
}
