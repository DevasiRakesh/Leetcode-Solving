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
        ListNode curr=head,next1;
        while(curr!=null){
            next1=curr.next;
            while(next1!=null && curr.val==next1.val){
                next1=next1.next;
            }
            curr.next=next1;
            curr=next1;
        }
        return head;
    }
}