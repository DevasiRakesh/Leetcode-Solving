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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int length = 0;
        ListNode temp = head;

        // Step 1: Count the total length of the list
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int partSize = length / k;         // Minimum size of each part
        int extra = length % k;            // First 'extra' parts have 1 more node

        ListNode current = head;
        for (int i = 0; i < k; i++) {
            ListNode dummy = new ListNode(0);
            ListNode write = dummy;

            int thisPartSize = partSize + (i < extra ? 1 : 0);  // Add 1 if within extra

            for (int j = 0; j < thisPartSize; j++) {
                write.next = current;
                write = write.next;
                if (current != null) current = current.next;
            }

            // Cut off the end of the current part
            if (write != null) write.next = null;

            result[i] = dummy.next;
        }

        return result;
    }
}