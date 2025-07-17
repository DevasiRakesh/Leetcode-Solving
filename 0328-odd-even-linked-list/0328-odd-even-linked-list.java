/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){return null;}
        ListNode oddH=head,evenH=head.next;
        ListNode evenV=head.next;
        while(evenH!=null && evenH.next!=null){
            oddH.next=evenH.next;
            oddH=evenH.next;
            evenH.next=oddH.next;
            evenH=oddH.next;
        }
        oddH.next=evenH;
        return head;

    }
}