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
       if (head == null) return null;

    HashMap<Node, Node> map = new HashMap<>();
    Node curr = head;
    Node prev = null;
    Node newHead = null;

    // First pass: Create the deep copy of each node and store them in the map
    while (curr != null) {
        Node temp = new Node(curr.val);
        map.put(curr, temp);
        
        if (newHead == null) {
            newHead = temp;
            prev = newHead;
        } else {
            prev.next = temp;
            prev = temp;
        }
        
        curr = curr.next;
    }

    // Second pass: Assign the random pointers
    curr = head;
    Node newcurr = newHead;
    
    while (curr != null) {
        newcurr.random = map.get(curr.random);  // correctly assign the random pointer
        curr = curr.next;
        newcurr = newcurr.next;  // move to the next node in the deep copy
    }

    return newHead;
    }
}