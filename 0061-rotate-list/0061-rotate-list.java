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
    public ListNode rotateRight(ListNode head, int k) {
        // 1.finding len and tail
        if(head==null){return null;}
        ListNode temp=head;
        int cnt=1;
        while(temp.next!=null){temp=temp.next;cnt++;}
        // 2.normalize the k val in len of list 
        k=(k%cnt);
        // 3.connecting tail to head
        temp.next=head;
        // finding newtail and tail.next is newHead len-k
        ListNode tail=head;
        for(int i=1;i<cnt-k;i++){
            tail=tail.next;
        }
        ListNode newHead=tail.next;
        tail.next=null;
        return newHead;
    }
}