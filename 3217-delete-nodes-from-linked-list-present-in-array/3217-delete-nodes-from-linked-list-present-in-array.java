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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=head,tail=dummy;
        while(curr!=null){
            if(!set.contains(curr.val)){
                tail.next=curr;
                tail=curr;
            }
            curr=curr.next;
        }
        tail.next=null;
        return dummy.next;
    }
}