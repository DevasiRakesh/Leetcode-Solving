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
    public ListNode partition(ListNode head, int x) {
        if(head==null){return head;}
        ListNode lsH=null,gtH=null,newls=null,newgt=null;
        while(head!=null){
            if(head.val<x){
                if(newls==null){newls=lsH=head;}
                else{lsH.next=head;lsH=head;}
            }else{
                if(newgt==null){newgt=gtH=head;}
                else{gtH.next=head;gtH=head;}
            }
            head=head.next;
        }
        if(newls!=null){
            lsH.next=newgt;
            if(gtH!=null){gtH.next=null;}
            return newls;}
        return newgt;
    }
}