class MyQueue {

   private Stack<Integer> in = null;
    private Stack<Integer> out = null;
    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        in.push(x);
    }
    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (out.empty()) {
            int size = in.size();
            for (int i = 0; i < size; i++)
                out.push(in.pop());
        }
        return out.pop();
    }
    /**
     * Get the front element.
     */
    public int peek() {
        if (out.empty()) {
            int size = in.size();
            for (int i = 0; i < size; i++)
                out.push(in.pop());
        }
        return out.peek();
    }
    /**
     * Returns whether the queue is empty.
     */
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