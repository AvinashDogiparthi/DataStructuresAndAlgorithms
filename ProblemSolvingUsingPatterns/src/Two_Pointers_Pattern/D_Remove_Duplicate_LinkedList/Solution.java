package Two_Pointers_Pattern.D_Remove_Duplicate_LinkedList;


public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode temporaryNode = head;

        while(temporaryNode != null && temporaryNode.next != null){

            while(temporaryNode.next != null && temporaryNode.val == temporaryNode.next.val){
                temporaryNode.next = temporaryNode.next.next;
            }


            temporaryNode = temporaryNode.next;
        }

        return head;
    }
}
