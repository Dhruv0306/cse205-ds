class MyQueue {
    Stack<Integer> lifo,fifo;
    public MyQueue() {
        lifo = new Stack<>();
        fifo = new Stack<>();
    }
    
    public void push(int x) {
        lifo.push(x);
    }
    
    public int pop() {
        while(!lifo.empty()){
            fifo.push(lifo.pop());
        }
        int temp = fifo.pop();
        while(!fifo.empty()){
            lifo.push(fifo.pop());
        }
        return temp;
    }
    
    public int peek() {
        while(!lifo.empty()){
            fifo.push(lifo.pop());
        }
        int temp = fifo.peek();
        while(!fifo.empty()){
            lifo.push(fifo.pop());
        }
        return temp;
    }
    
    public boolean empty() {
        return lifo.empty();
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