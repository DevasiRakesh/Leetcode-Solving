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
        if(head==null || head.next==null){return head;}
        ListNode dummy=new ListNode(-1);
        dummy.next=reverse(head);
        ListNode curr=dummy;
        while(curr.next!=null){
            ListNode next1=curr.next;
            if(curr.val>next1.val){
                while(next1!=null && curr.val>next1.val){
                    next1=next1.next;
                }
            }
            curr.next=next1;
            curr=next1;
            if(curr==null){break;}
        }
        return reverse(dummy.next);
    }
}