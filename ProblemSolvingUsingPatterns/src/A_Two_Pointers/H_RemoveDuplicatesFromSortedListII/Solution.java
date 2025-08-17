package A_Two_Pointers.H_RemoveDuplicatesFromSortedListII;

import A_Two_Pointers.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previous = dummy;
        ListNode current = head;

        while(current !=null){

            if(current.next  != null && current.val == current.next.val)
            {

                while(current.next != null && current.val == current.next.val){
                    current = current.next;
                }

                previous.next = current.next;
            } else {
                previous = previous.next;
            }

            current = current.next;
        }

        return dummy.next;
    }
}
