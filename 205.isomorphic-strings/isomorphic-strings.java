public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            if(mapS.containsKey(cs))
                if(mapS.get(cs) != ct) return false;
                
            if(mapT.containsKey(ct))
                if(mapT.get(ct) != cs) return false;
                
            mapS.put(cs, ct);
            mapT.put(ct, cs);
        }
        
        return true;
    }
}