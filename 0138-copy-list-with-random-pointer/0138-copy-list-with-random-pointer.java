/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){return null;}
      Node temp=head;
      HashMap<Node,Node>map =new HashMap<>();
      while(temp!=null){
        map.put(temp,new Node(temp.val));
        temp=temp.next;
      }
      temp=head;
      while(temp!=null){
        Node curr=map.get(temp);
        curr.next=map.get(temp.next);
        curr.random=map.get(temp.random);
        temp=temp.next;
      }
      System.out.print(head.next.random);
      return map.get(head);
    }
}