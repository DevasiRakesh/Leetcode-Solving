/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
  // if(sum==0){
            //     map.clear();
            //     head=temp.next;
            // }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        int sum=0;
        while(curr!=null){
            sum+=curr.val;
            if(map.containsKey(sum)){
                ListNode prev=map.get(sum);
                ListNode runner=prev.next;
                int total=sum;
                while(runner!=curr){
                    total+=runner.val;
                    if(map.containsKey(total)){map.remove(total);}
                    runner=runner.next;
                }
                prev.next=curr.next;
            }else{
                map.put(sum,curr);
            }            
            curr=curr.next;
        }
        return dummy.next;
    }
}