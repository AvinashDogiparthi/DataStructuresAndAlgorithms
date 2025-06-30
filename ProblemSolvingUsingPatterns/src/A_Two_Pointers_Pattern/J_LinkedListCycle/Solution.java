package A_Two_Pointers_Pattern.J_LinkedListCycle;

import A_Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null)
        {

            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
