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
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // mistake here check and don't do again
        // ListNode dummy=new ListNode(0);
        // ListNode tail=dummy,curr=head;
        // while(curr.next!=null){
        //     tail.next=curr;
        //     tail=curr;
        //     int gcdv=gcd(curr.val,curr.next.val);
        //     ListNode node=new ListNode(gcdv);
        //     tail.next=node;tail=node;
        //     curr=curr.next;
        // }
        // tail.next=curr;
        // tail=curr;
        // return dummy.next;
        ListNode curr=head,tail=head;
        while(curr!=null && curr.next!=null){
            int gcdv=gcd(curr.val,curr.next.val);
            ListNode gcdn=new ListNode(gcdv);
            gcdn.next=curr.next;
            curr.next=gcdn;
            curr=gcdn.next;
        }
        return head;
    }
}