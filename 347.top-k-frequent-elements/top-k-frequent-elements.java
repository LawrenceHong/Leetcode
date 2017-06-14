public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v : nums)
            map.put(v, map.getOrDefault(v, 0)+1);
        
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                    return b.getValue() - a.getValue();
                }      
            }
        );
        
        queue.addAll(map.entrySet());
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            res.add(queue.poll().getKey());
        }
        
        return res;
    }
}