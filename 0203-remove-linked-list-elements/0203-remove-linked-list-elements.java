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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){return null;}
        ListNode curr=head,prev=null;
        while(curr!=null){
            boolean check=false;
            if(curr.val==val){
                while(curr!=null && curr.val==val){
                    curr=curr.next;
                }
                check=true;
            }
            if(check){
                if(prev==null){prev=head=curr;}
                else{
                    prev.next=curr;check=false;
                }
                continue;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}