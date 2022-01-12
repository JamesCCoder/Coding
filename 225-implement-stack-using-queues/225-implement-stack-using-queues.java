class MyStack {
    
    private Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<>();
    }
    
    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        for(int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }
    
    //出队
    public int pop() {
        return queue.poll();
    }
    
    //返回栈顶元素，但是不移除
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
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