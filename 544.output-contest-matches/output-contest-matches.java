public class Solution {
    public String findContestMatch(int n) {
        List<String> matches = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            matches.add(String.valueOf(i));
        
        while(matches.size() != 1) {
            List<String> newMatches = new ArrayList<>();
            for(int i = 0; i < matches.size()/2; i++)
                newMatches.add("(" + matches.get(i) + "," + matches.get(matches.size() - 1 - i) + ")");
            matches = newMatches;    
        }
        
        return matches.get(0);
    }
}