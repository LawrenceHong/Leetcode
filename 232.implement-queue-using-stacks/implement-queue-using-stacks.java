public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack2.push(x);
    }
    
    private void stack2ToStack1() {
        while(!stack2.empty())
            stack1.push(stack2.pop());
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack1.empty() == true)
            stack2ToStack1();
        return stack1.pop();    
    }
    
    /** Get the front element. */
    public int peek() {
        if(stack1.empty() == true)
            stack2ToStack1();
        return stack1.peek();    
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty() && stack2.empty();
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