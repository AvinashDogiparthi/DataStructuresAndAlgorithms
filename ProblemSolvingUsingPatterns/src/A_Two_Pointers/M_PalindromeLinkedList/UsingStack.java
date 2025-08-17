package A_Two_Pointers_Pattern.M_PalindromeLinkedList;

import A_Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList.ListNode;

import java.util.Stack;

public class UsingStack {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stackOfValues = new Stack<>();

        ListNode temp = head;

        while(temp!=null){
            stackOfValues.push(temp.val);
            temp =  temp.next;
        }

        ListNode curr = head;

        while(curr!=null){
            int valueFromStack = stackOfValues.pop();
            if(curr.val != valueFromStack) return false;
            curr = curr.next;
        }

        return true;
    }
}
