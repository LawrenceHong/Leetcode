public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapM = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++) {
            if(mapM.containsKey(magazine.charAt(i))) {
                int v = mapM.get(magazine.charAt(i)) + 1;
                mapM.put(magazine.charAt(i), v);
            }
            else
                mapM.put(magazine.charAt(i), 1);
        }
        
        HashMap<Character, Integer> mapR = new HashMap<Character, Integer>();
        for(int i = 0; i < ransomNote.length(); i++) {
            if(mapR.containsKey(ransomNote.charAt(i))) {
                int v = mapR.get(ransomNote.charAt(i)) + 1;
                mapR.put(ransomNote.charAt(i), v);
            }
            else
                mapR.put(ransomNote.charAt(i), 1);
        }
        
        for(Character key : mapR.keySet()) {
            
            if(!(mapM.containsKey(key) && mapR.get(key) <= mapM.get(key)))
                return false;
        }
        
        return true;
    }
}