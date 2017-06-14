public class MyStack {
    private Queue<Integer> q = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = q.size();
        for(int i = 1; i < size; ++i) {
            q.offer(q.poll());
        }
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        int size = q.size();
        for(int i = 1; i < size; ++i) {
            q.offer(q.poll());
        }
        
        int top = q.peek();
        q.offer(q.poll());
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
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