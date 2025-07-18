/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){break; }
        }
        if(fast==null || fast.next==null){return null;}
        if(slow==head){return head;}
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.next;
    }
}