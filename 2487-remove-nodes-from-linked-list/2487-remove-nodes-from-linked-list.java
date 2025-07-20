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
    public ListNode removeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr=reverse(head),tail=dummy;
        int max=Integer.MIN_VALUE;
        while(curr!=null){
            if(curr.val>=max){
                tail.next=curr;
                tail=curr;
                max=curr.val;
            }
            curr=curr.next;
        }
        tail.next=null;
        return reverse(dummy.next);
    }
}