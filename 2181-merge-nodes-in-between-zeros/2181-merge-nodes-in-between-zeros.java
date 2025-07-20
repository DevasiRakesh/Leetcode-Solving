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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr=head.next,tail=dummy;
        int sum=0;
        while(curr!=null){
            sum+=curr.val;
            if(curr.val==0){
                ListNode dum=new ListNode(sum);
                tail.next=dum;
                tail=dum;sum=0;
            }
            curr=curr.next;
        }
        tail.next=null;
        return dummy.next;
    }
}