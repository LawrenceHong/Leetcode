public class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> cloSet = new HashSet<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    cloSet.add(i);
                    rowSet.add(j);
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(rowSet.contains(j) || cloSet.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // for(Integer i : cloSet) {
        //     for(Integer j : rowSet) {
        //         matrix[i][j] = 0;
        //     }
        // }
    }
}