class MinStack {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        dataStack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int x = dataStack.pop();
        if(x == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return dataStack.peek();
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