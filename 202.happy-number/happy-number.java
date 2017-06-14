public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1) {
            if(set.contains(n))
                return false;
            set.add(n);
            n = getNextHappyNum(n);
        }
        
        return true;
    }
    
    private int getNextHappyNum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n%10)*(n%10);
            n /= 10;
        }
        
        return sum;
    }
}