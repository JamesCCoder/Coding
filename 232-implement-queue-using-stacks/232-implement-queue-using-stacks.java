class MyQueue {

   private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public MyQueue() {
      
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.empty()) {
            int size = in.size();
            for (int i = 0; i < size; i++)
                out.push(in.pop());
        }
        return out.pop();
    }
  
    public int peek() {
        if (out.empty()) {
            int size = in.size();
            for (int i = 0; i < size; i++)
                out.push(in.pop());
        }
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
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