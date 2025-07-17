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
    public static ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,next1;
        while(curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode h1=reverse(l1),h2=reverse(l2);
        // ListNode newNode=new ListNode(-1);
        // ListNode temp=newNode;
        // int curr=0;
        // while(h1!=null || h2!=null || curr!=0){
        //     int sum=curr;
        //     if(h1!=null){sum+=h1.val;h1=h1.next;}
        //     if(h2!=null){sum+=h2.val;h2=h2.next;}
        //     curr=sum/10;
        //     ListNode newNode1=new ListNode(sum%10);
        //     temp.next=newNode1;
        //     temp=newNode1;
        // }
        // return reverse(newNode.next);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push all digits into the stacks
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        // Pop and add digits
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            // Create a new node and insert at the front
            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;

            carry = sum / 10;
        }

        return result;
    }
}