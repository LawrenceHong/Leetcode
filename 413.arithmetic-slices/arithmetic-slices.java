public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int adder = 0;
        int count = 0;
        for(int i = 1; i < A.length-1; i++) {
            if(A[i]-A[i-1] == A[i+1]-A[i]) {
                adder++;
                count = count+adder;
            }
            else {
                adder = 0;
            }
        }
        
        return count;
    }
}