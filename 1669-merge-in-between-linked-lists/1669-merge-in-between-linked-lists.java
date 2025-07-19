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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA=null ,nodeB=null,runner=list1;
        int i=0;
        while(runner!=null && (i<a || i<=b) ){
            if(i<a){prevA=runner;}
            if(i==b){nodeB=runner;}
            i++;
            runner=runner.next;
        }
        // 2.tail of list2 
        ListNode tran=list2;
        while(tran.next!=null){tran=tran.next;}
        prevA.next=list2;
        tran.next=nodeB.next;
        return list1;
    }
}