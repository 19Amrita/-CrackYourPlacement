class MyStack {
     Queue<Integer>in;
     Queue<Integer>out;
    public MyStack() {
        in=new LinkedList<>();
        out=new LinkedList<>();
    }
    
    public void push(int x) {
        in.offer(x);
    }
    
    public int pop() {
        while (in.size() > 1) {
            out.offer(in.poll());
        }
           int topElement = in.poll();
       Queue<Integer> temp = in;
        in = out;
        out = temp;

        return topElement;
    }
    
    public int top() {
          while (in.size() > 1) {
            out.offer(in.poll());
        }
        int topElement = in.peek();
         out.offer(in.poll());
      Queue<Integer> temp = in;
        in = out;
        out = temp;

        return topElement;

    }
    
    public boolean empty() {
         return in.isEmpty() && out.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */