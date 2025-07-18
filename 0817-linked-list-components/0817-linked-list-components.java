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
        //  ListNode temp=head;
        //  HashSet<Integer> set=new HashSet<>();
        //  int connect=0,nc=0;
        //  for(int num:nums){
        //     set.add(num);
        //  }
        //  while(temp!=null){
        //     if(set.contains(temp.val)){
        //         boolean check=false;
        //         while(temp!=null && set.contains(temp.val)){
        //             temp=temp.next;
        //             check=true;
        //         }
        //         if(check){connect++;}else{nc++;}
        //     }else{temp=temp.next;}
        //  }
        //  return nc+connect;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int count = 0;
        while (head != null) {
            if (set.contains(head.val) &&
                (head.next == null || !set.contains(head.next.val))) {
                count++;
            }
            head = head.next;
        }
        return count;

    }
}