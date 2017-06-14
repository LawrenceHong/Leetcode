public class Solution {
    public String decodeString(String s) {
        String result = ""; 
        Stack<String> stringStack = new Stack<>(); 
        Stack<Integer> countStack = new Stack<>(); 
        int index = 0; 
         
        while (index < s.length()) { 
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') { 
                int count = 0; 
                while (s.charAt(index) >= '0' && s.charAt(index) <= '9') { 
                    count = count * 10 + (s.charAt(index) - '0'); 
                    index++; 
                } 
                countStack.push(count); 
            } else if (s.charAt(index) == '[') { 
                stringStack.push(result); 
                result = ""; 
                index++; 
            } else if (s.charAt(index) == ']') { 
                StringBuilder sb = new StringBuilder(stringStack.pop()); 
                int repeat = countStack.pop(); 
                for (int i = 0; i < repeat; i++) { 
                    sb.append(result); 
                } 
                result = sb.toString(); 
                index++; 
            } else { 
                result += s.charAt(index);                 
                index++; 
            }              
        } 
         
        return result; 
    }
}