public class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(
            new Comparator<Map.Entry<Character, Integer>>() {
                public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                    return b.getValue() - a.getValue();
                }      
            }    
        );
        
        queue.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while(queue.size() != 0) {
            Map.Entry e = queue.poll();
            for(int i = 0; i < (int)e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        
        return sb.toString();
    }
}