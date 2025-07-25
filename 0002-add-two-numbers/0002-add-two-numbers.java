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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int curr=0;
        ListNode newHead=new ListNode(-1);
        ListNode tail=newHead;
        while(l1!=null || l2!=null || curr!=0){
            int sum=curr;
            if(l1!=null){sum+=l1.val;l1=l1.next;}
            if(l2!=null){sum+=l2.val;l2=l2.next;}
            curr=sum/10;
            ListNode newH=new ListNode(sum%10);
            tail.next=newH;
            tail=newH;
        }
        return newHead.next;
    }
}