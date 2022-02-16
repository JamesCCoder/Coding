class MinStack {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        dataStack.add(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int x = dataStack.pop();
        if(x ==minStack.peek()){
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