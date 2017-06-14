public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int second = stack.peek();
                stack.pop();
                int first = stack.peek();
                stack.pop();
                stack.push(evaluate(first, second, s));
            }
            else {
                stack.push(Integer.valueOf(s));
            }
        }
        
        return stack.peek();
    }
    private int evaluate(int x, int y, String op) {
        if(op.equals("+"))
            return x+y;
        else if(op.equals("-"))
            return x-y;
        else if(op.equals("*"))
            return x*y;
        else if(op.equals("/"))
            return x/y;
        
        return Integer.MAX_VALUE;    
    }
}