package Two_Pointers_Pattern.M_PalindromeLinkedList;

import Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class usingTwoPointers {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode current = slow;
        ListNode previous = null;

        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        ListNode halfReverse = previous;
        ListNode firstHalf = head;

        while(halfReverse != null){
            if(halfReverse.val != firstHalf.val){
                return false;
            }

            halfReverse = halfReverse.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }
}
