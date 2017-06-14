public class TwoSum {
    private HashMap<Integer, Integer> map;
    private List<Integer> list;
    /** Initialize your data structure here. */
    public TwoSum() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(map.containsKey(number)) map.put(number, map.get(number)+1);
        else {
            map.put(number, 1);
            list.add(number);
        }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int i = 0; i < list.size(); i++) {
            int n1 = list.get(i);
            int n2 = value - n1;
            if((n1 == n2 && map.get(n1) > 1) || (n1 != n2 && map.containsKey(n2)))
                return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */