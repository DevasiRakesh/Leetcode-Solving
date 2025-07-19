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
    public static int findSize(ListNode head){
        int i=0;
        ListNode curr=head;
        while(curr!=null){
            i++;
            curr=curr.next;
        }
        return i;
    }
    public int getDecimalValue(ListNode head) {
        int size=findSize(head);
        int sum=0;
        while(head!=null){
            size--;
            int pow=1<<size;
            sum+=head.val*pow;
            head=head.next;
        }
        return sum;
    }
}