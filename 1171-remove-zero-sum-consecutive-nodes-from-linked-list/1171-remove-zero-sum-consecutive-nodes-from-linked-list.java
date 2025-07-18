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
        HashMap<Integer,ListNode> map=new HashMap<>();
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.val;
            if(sum==0){
                map.clear();
                head=temp.next;
            }
            else if(map.containsKey(sum)){
                ListNode node=map.get(sum);
                ListNode newNode=node.next;
                int total=sum;
                while(newNode!=temp){
                    total+=newNode.val;
                    if(map.containsKey(total)){map.remove(total);}
                    newNode=newNode.next;
                }
                node.next=temp.next;
            }else{
                map.put(sum,temp);
            }
            System.out.println(sum);
            
            temp=temp.next;
            
        }
        return head;
    }
}