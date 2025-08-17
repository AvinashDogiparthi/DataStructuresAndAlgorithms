package A_Two_Pointers.G_IntersectionOfTwoLinkedList;

import A_Two_Pointers.D_Remove_Duplicate_LinkedList.ListNode;

public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return headA;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while(pointerA != pointerB){
            pointerA = (pointerA == null)?headB:pointerA.next;
            pointerB = (pointerB == null)?headA:pointerB.next;
        }

        return pointerA;
    }
}
