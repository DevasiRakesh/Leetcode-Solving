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
    public static ListNode reverse(ListNode head,ListNode prev1){
        ListNode curr=head,prev=prev1,next1;
        while(curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){return head;}
        ListNode prevl=null,rt=head;
        int i=1,j=1;
        ListNode temp=head,temp1=head.next;
        while(temp!=null && i<left){if(prevl==null){prevl=temp;}else{prevl.next=temp;prevl=temp;}i++;temp=temp.next;}
        while(temp1!=null && j<right){rt.next=temp1;rt=temp1;j++;temp1=temp1.next;}
        ListNode next1=rt.next,prevN=(prevl!=null)?prevl.next:head;
        rt.next=null;
        ListNode node=reverse(prevN,next1);
        if(prevl==null){head=node;}
        else{prevl.next=node;}
        
        return head;
    }
}