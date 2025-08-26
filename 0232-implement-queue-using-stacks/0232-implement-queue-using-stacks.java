class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            int a = st1.pop();
            st2.push(a);
        }
        return st2.pop();
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            int a = st1.pop();
            st2.push(a);
        }
        return st2.peek();
    }
    
    public boolean empty() {
        while(!st1.isEmpty()){
            int a = st1.pop();
            st2.push(a);
        }
        return st2.isEmpty();
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