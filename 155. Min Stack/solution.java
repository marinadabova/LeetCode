class MinStack {
    int min=Integer.MAX_VALUE;
    Stack<Integer> s=new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(val<=min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }
    
    public void pop() {
        if(s.pop()==min){
            min=s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
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

class MinStack {
    int min=Integer.MAX_VALUE;
    Stack<Integer> s=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val< minStack.peek()){
            minStack.push(val);
        }else{
            minStack.add(minStack.peek());
        }
        
        s.push(val);
    }
    
    public void pop() {
       s.pop();
       minStack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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
