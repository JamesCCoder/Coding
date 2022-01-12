class MaxStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> maxStack;
    
    public MaxStack() {
        dataStack = new Stack<>();
        maxStack = new Stack<>();
    }
    
    public void push(int x) {
        dataStack.push(x);
        if(maxStack.isEmpty() || x >= maxStack.peek()){
            maxStack.push(x);
        }
    }
    
    public int pop() {
        int x = dataStack.pop();
        if(x == maxStack.peek()){
            maxStack.pop();
        }
        return x;
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int peekMax() {
        return maxStack.peek();
    }
    
    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack();
        while (top() != max) buffer.push(pop());
        pop();
        while (!buffer.isEmpty()) push(buffer.pop());
        return max;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */