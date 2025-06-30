package A_Two_Pointers_Pattern.K_LinkedListCycleII;

import A_Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class UsingFloydCycleDetection {

    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null) return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        ListNode cycleStartNode = null;

        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){

                ListNode temp = head;

                while(temp != slowPointer){
                    slowPointer = slowPointer.next;
                    temp = temp.next;
                }

                return slowPointer;

            }
        }

        return cycleStartNode;

    }

}
