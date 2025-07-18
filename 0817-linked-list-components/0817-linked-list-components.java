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
    public int numComponents(ListNode head, int[] nums) {
         ListNode temp=head;
         HashSet<Integer> set=new HashSet<>();
         int connect=0,nc=0;
         for(int num:nums){
            set.add(num);
         }
         while(temp!=null){
            if(set.contains(temp.val)){
                if(temp.next!=null){
                    if(set.contains(temp.next.val)){
                        connect++;
                        temp=temp.next;
                        while(temp!=null && set.contains(temp.val)){
                            temp=temp.next;
                        }
                        continue;
                        }
                    else{nc++;temp=temp.next;}
                }else{nc++;temp=temp.next;}
            }else{temp=temp.next;}
         }
         return nc+connect;

    }
}