public class Solution {
    public String reverseWords(String s) {
        //List<String> list = new ArrayList<>();
        String[] list = s.split("\\s{1,}");
        
        String res = "";
        for(int i = 0; i < list.length; i++) {
            res= res + list[list.length - i - 1].trim() + " ";
        }
        
        return res.trim();
    }
}