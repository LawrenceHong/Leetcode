public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if (minStack.empty() == true)
            minStack.push(x);
        else
        if (minStack.peek() >= x)
            minStack.push(x);
    }
    
    public void pop() {
        //if(stack.peek() == minStack.peek())
        //    minStack.pop();
        //stack.pop();
        if (stack.peek().equals(minStack.peek()) ) 
            minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */