package Two_Pointers_Pattern.K_LinkedListII;

import Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null)
        {

            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){

                ListNode tempNode = head;

                while(tempNode != slow){
                    tempNode = tempNode.next;
                    slow = slow.next;
                }

                return slow;
            }
        }

        return null;
    }
}
