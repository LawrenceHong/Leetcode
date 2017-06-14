public class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String dir : dirs) {
            if(dir.equals("")) continue;
            if(dir.equals(".")) continue;
            if(dir.equals("..") && !stack.isEmpty()) stack.pop();
            if(!dir.equals("..")) stack.push(dir);
        }

        StringBuilder newPath = new StringBuilder("/");
        while (!stack.isEmpty()) {
            newPath.insert(0, "/" + stack.pop());
        }

        return newPath.toString().equals("/") ? newPath.toString() : newPath.deleteCharAt(newPath.length()-1).toString();
    }
}