public class Solution {
    public int calculate(String s) {
        int res = 0;
        int d = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0') {
                d = 10*d + s.charAt(i) - '0';
            }
            
            //stack.push(d);
            
            if((s.charAt(i) < '0' && s.charAt(i) != ' ') || i == s.length() - 1) {
                if(sign == '+') {
                    //System.out.println("i");
                    stack.push(d);
                }
                if(sign == '-')
                    stack.push(-d);
                
                if(sign == '*' || sign == '/') {
                    int tmp = sign == '*' ? stack.peek() * d : stack.peek() / d;
                    stack.pop();
                    stack.push(tmp);
                }
                sign = s.charAt(i);
                d = 0;
            }
        }
        
        while(stack.size() != 0) {
            res += stack.peek();
            stack.pop();
        }
        
        return res;
    }
}