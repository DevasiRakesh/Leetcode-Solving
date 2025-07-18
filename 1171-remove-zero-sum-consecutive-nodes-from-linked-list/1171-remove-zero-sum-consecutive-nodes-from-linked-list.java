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
    public ListNode removeZeroSumSublists(ListNode head) {
        // HashMap<Integer,ListNode> map=new HashMap<>();
        // ListNode temp=head;
        // int sum=0;
        // while(temp!=null){
        //     sum+=temp.val;
        //     if(sum==0){
        //         map.clear();
        //         head=temp.next;
        //     }
        //     else if(map.containsKey(sum)){
        //         ListNode node=map.get(sum);
        //         ListNode newNode=node.next;
        //         int total=sum;
        //         while(newNode!=temp){
        //             total+=newNode.val;
        //             if(map.containsKey(total)){map.remove(total);}
        //             newNode=newNode.next;
        //         }
        //         node.next=temp.next;
        //     }else{
        //         map.put(sum,temp);
        //     }            
        //     temp=temp.next;
        // }
        // return head;
         // Dummy node to simplify edge case handling
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> prefixMap = new HashMap<>();
        int sum = 0;
        ListNode curr = dummy;

        // First pass: build prefix sum map
        while (curr != null) {
            sum += curr.val;
            prefixMap.put(sum, curr);
            curr = curr.next;
        }

        // Second pass: remove zero sum sublists
        sum = 0;
        curr = dummy;
        while (curr != null) {
            sum += curr.val;
            // If prefix sum already seen, skip all nodes in between
            curr.next = prefixMap.get(sum).next;
            curr = curr.next;
        }

        return dummy.next;
    }
}