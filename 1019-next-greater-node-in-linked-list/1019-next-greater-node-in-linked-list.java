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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();

        // Step 1: Convert linked list to array
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int n = values.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stack stores indices

        // Step 2: Process each node using monotonic stack
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && values.get(i) > values.get(stack.peek())) {
                int idx = stack.pop();
                result[idx] = values.get(i); // set next greater
            }
            stack.push(i);
        }

        // Step 3: Unset positions remain 0 by default
        return result;
    }
}