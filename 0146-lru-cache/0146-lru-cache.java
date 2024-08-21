class LRUCache {
     class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node (int key , int val)
        {
            this.key=key;
            this.val=val;
        }
     }
     Node head = new Node(-1,-1);
     Node tail = new Node(-1,-1); 
      int n;
      HashMap<Integer,Node>map=new HashMap<>();
    public LRUCache(int capacity) {
        n=capacity;
        head.next=tail;
        tail.prev=head;
    }
    private void addNode(Node node)
    {
        Node temp = head.next;
        node.next = temp;
        node.prev = head;
        head.next = node;
        temp.prev = node;

    }
    private void delNode(Node node)
    {
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    public int get(int key) 
    {
        if(map.containsKey(key)){
            Node resNode = map.get(key);
            int ans=resNode.val;
            map.remove(key);
            delNode(resNode);
            addNode(resNode);
            map.put(key,head.next);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node curr=map.get(key);
            map.remove(key);
            delNode(curr);
        }
        if(map.size()==n)
        {
            map.remove(tail.prev.key);
            delNode(tail.prev);

        }
        addNode(new Node(key,value));
        map.put(key,head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */