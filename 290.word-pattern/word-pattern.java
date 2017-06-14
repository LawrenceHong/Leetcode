public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length)
            return false;
        Map map = new HashMap();
        for(Integer i = 0; i < strs.length; i++) {
            if(map.put(pattern.charAt(i), i) != map.put(strs[i], i))
                return false;
        }
        
        return true;
        // String[] words = str.split(" ");
        // if (words.length != pattern.length())
        //     return false;
        // Map index = new HashMap();
        // for (Integer i=0; i<words.length; ++i)
        //     if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
        //         return false;
        // return true;
    }
}