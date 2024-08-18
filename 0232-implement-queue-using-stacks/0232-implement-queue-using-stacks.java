class MyQueue {

       Stack<Integer>st,st1;
    public MyQueue() {
        st=new Stack<>();
        st1=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(!st1.isEmpty())
        return st1.pop();
        else
        {
            while(!st.isEmpty())
                st1.push(st.pop());
            
        }
        return st1.pop();
    }
    
    public int peek() {
         if(!st1.isEmpty())
        return st1.peek ();
        else
        {
            while(!st.isEmpty()){
                st1.push(st.pop());
            }
        }
        return st1.peek();
    }
    
    public boolean empty() {
        return st.empty() && st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */