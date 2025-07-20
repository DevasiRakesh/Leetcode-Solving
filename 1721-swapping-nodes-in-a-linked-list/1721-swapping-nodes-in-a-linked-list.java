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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode first = head;
        // Step 1: Find kth node from beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Step 2: Use two pointers to find kth node from end
        ListNode second = head;
        ListNode temp = first;
        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // Step 3: Swap their values
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;

        return head;
    }
}