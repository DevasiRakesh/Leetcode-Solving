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
    public ListNode swapPairs(ListNode head) {
            // Create a dummy node to simplify the logic (especially for head swaps)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        // Traverse in pairs
        while (head != null && head.next != null) {
            // Nodes to be swapped
            ListNode first = head;
            ListNode second = head.next;

            // Swapping
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Re-position pointers for next swap
            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}