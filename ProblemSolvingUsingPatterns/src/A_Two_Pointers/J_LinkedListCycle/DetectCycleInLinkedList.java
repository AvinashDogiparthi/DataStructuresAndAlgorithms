package A_Two_Pointers.J_LinkedListCycle;

import A_Two_Pointers.D_Remove_Duplicate_LinkedList.ListNode;

public class DetectCycleInLinkedList {
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }

        return false;
    }
}
