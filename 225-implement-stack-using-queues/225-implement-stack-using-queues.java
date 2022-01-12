class MyStack {

    private Queue<Integer> r = new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        int s = r.size();
        r.add(x);
        
        for(int i = 0; i<s; i++){
            r.add(r.poll());
        }
    }
    
    public int pop() {
       return r.poll();
    }
    
    public int top() {
       return r.peek();
    }
    
    public boolean empty() {
        return r.isEmpty();
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