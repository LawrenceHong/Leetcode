public class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = Integer.toString(nums[i]); 
        }
        
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        
        String sb = "";
        for(String s : str)
            sb+=s;
            
        int index = 0;    
        while (index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }
        if (index == sb.length()) {
            return "0";
        }
        return sb.substring(index);    
    }
}