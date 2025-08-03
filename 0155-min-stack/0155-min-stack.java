class MinStack {
    private Stack<Long> ans;
    long min=Integer.MAX_VALUE;


    public MinStack() {
        ans=new Stack<Long>();
        
    }
    
    public void push(int x) {
        Long value = Long.valueOf(x);
        if(ans.empty()){
            min=value;
            ans.push(value);
        }
        else {
            if(value>min){
                ans.push(value);
            }
            else{
            ans.push(2*value-min);
            min=value;
            }
        }
    }
    
    public void pop() {
        if(ans.empty())return;
        long y=ans.peek();
        ans.pop();
        if(y<min){
            min=2*min-y;
        }

        
    }
    
    public int top() {
        if(ans.empty())return -1;
        long z=ans.peek();
       if(min<z) return Math.toIntExact(z);
       return Math.toIntExact(min);
        
    }
    
    public int getMin() {
        return Math.toIntExact(min);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */