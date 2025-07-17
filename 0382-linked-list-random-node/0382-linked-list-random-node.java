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
    List<Integer> list=new ArrayList<>();
    Random rand = new Random();
    ListNode head;
    public Solution(ListNode head) {
        this.head=head;
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
    }
    public int getRandom() {
        // int n=list.size();
        // int random_Index=rand.nextInt(n);
        // return list.get(random_Index);
        int res = -1;
        int i = 1;

        for (ListNode curr = head; curr != null; curr = curr.next, ++i)
        if (rand.nextInt(i) == i - 1)
            res = curr.val;

        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */