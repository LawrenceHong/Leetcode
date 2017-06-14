public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (int)(Math.log10(num)/Math.log10(4)) == Math.log10(num)/Math.log10(4);
        //return num > 0 && !(num & (num - 1)) && (num & 0x55555555) == num;
        //return num > 0 && !(num & (num - 1)) && (num - 1) % 3 == 0;
    }
}