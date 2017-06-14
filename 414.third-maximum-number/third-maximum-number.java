public class Solution {
    public int thirdMax(int[] nums) {
        long firstNum = Long.MIN_VALUE;
        long secondNum = Long.MIN_VALUE;
        long thirdNum = Long.MIN_VALUE;
        
        //if(nums.length == 2) {
        //    return Math.max(nums[0], nums[1]);
        //}
        
        for(int v : nums) {
            if(v > firstNum) {
                thirdNum = secondNum;
                secondNum = firstNum;
                firstNum = v;
            }
            
            if(v > secondNum && v < firstNum) {
                thirdNum = secondNum;
                secondNum = v;
            }
            
            if(v > thirdNum && v < secondNum) {
                thirdNum = v;
            }
        }
        //System.out.println(firstNum);
        //System.out.println(secondNum);
        //System.out.println(thirdNum);
        return (int)((thirdNum == Long.MIN_VALUE || thirdNum == secondNum) ? firstNum : thirdNum);
        
    }
}