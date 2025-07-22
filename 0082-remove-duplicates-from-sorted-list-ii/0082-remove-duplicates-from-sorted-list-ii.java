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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head,prev=null,next1;
        while(curr!=null){
            boolean check=false;
            next1=curr.next;
            while(next1!=null && curr.val==next1.val){next1=next1.next;check=true;}
            if(check){if(next1==null){if(prev!=null){prev.next=null;}} curr=next1;}
            else{if(prev==null){prev=head=curr;}else{prev.next=curr;prev=curr;}curr=next1;}
        }
        if(prev==null){return null;}
        return head;
    }
}