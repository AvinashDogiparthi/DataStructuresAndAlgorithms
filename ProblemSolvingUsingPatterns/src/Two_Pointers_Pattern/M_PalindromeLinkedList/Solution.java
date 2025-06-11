package Two_Pointers_Pattern.M_PalindromeLinkedList;

import Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow, prevNode = null, nextNode = curr;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        ListNode secondHalf = prevNode;
        ListNode firstHalf = head;
        while(secondHalf != null){
            if(secondHalf.val != firstHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf= secondHalf.next;
        }
        return true;
    }
}
