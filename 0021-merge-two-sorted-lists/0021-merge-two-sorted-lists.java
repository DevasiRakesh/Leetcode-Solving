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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(list1!=null || list2!=null){
            int sum1=(list1!=null)?list1.val:Integer.MAX_VALUE;
            int sum2=(list2!=null)?list2.val:Integer.MAX_VALUE;
            if(sum1<sum2){
                ListNode dummy1=new ListNode(sum1);
                curr.next=dummy1;
                curr=dummy1;
                list1=list1.next;
            }else{
                ListNode dummy1=new ListNode(sum2);
                curr.next=dummy1;
                curr=dummy1;
                list2=list2.next;
            }
        }
        return dummy.next;
    }
}