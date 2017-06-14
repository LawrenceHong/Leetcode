public class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int water = 0;
        while(i < j) {
            int h = Math.min(height[i], height[j]);
            water = Math.max(water, h * (j - i));
            while(height[i] <= h && i < j) i++;
            while(height[j] <= h && i < j) j--;
        }
        
        return water;
    }
}