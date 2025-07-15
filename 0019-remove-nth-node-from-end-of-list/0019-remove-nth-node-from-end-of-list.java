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
    public static int size(ListNode head){
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=size(head);
        
        if(n==len){return head.next;}
        System.out.print(len+"");
        int i=1;
        ListNode temp=head;
        while(i<len-n){temp=temp.next;i++;}
        temp.next=temp.next.next;
        return head;
    }
}