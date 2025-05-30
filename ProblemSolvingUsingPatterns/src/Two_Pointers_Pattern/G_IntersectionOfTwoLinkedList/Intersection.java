package Two_Pointers_Pattern.G_IntersectionOfTwoLinkedList;

import Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

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
