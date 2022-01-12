class MyQueue {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(out.isEmpty()){
            int s = in.size();
            for(int i = 0; i<s; i++){
                out.push(in.pop());
            }
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.isEmpty()){
            int s = in.size();
            for(int i = 0; i<s; i++){
                out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
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