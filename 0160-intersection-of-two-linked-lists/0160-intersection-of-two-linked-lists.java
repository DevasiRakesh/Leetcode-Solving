/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1=headA,curr2=headB;
        while(curr1!=curr2){
            curr1=(curr1!=null)curr1.next:headB;
            curr2=(curr2!=null)curr2.next:headA;
        }
        return curr1;
    }
}