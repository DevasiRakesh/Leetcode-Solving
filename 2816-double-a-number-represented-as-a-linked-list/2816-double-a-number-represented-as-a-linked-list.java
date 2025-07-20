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
    public static ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode curr=reverse(head);
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(curr!=null || carry!=0){
            int val = carry;
            if (curr != null) {
                val += curr.val * 2;
            }
            tail.next = new ListNode(val % 10);
            carry = val / 10;
            tail = tail.next;

            if(curr!=null) curr = curr.next;
        }
        return reverse(dummy.next);
    }
}