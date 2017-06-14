public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder();
            if ("++".equals(s.substring(i, i+2)))
                list.add(sb.append(s.substring(0, i)).append("--").append(s.substring(i+2)).toString());
        }
        
        return list;
    }
}