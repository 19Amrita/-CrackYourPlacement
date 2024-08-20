class StockSpanner {
   Stack<Integer>st;
   List<Integer>list;
    public StockSpanner() {
        st=new Stack<>();
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);//100
        while(!st.isEmpty() && list.get(st.peek())<=price){
            st.pop();
        }
        int pregreIn=0;
        if(!st.isEmpty()){
            pregreIn=st.peek();
        }
        else
        {
            pregreIn=-1;
        }
        st.push(list.size()-1);
        return (list.size()-1)-pregreIn;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */