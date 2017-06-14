public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + carry < 10) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        
        return res;
    }
}