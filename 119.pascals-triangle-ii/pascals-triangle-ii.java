public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        if(rowIndex <= 0) {
            List<Integer> res = new ArrayList<>();
            res.add(1);
            return res;
        }
        
        for(int i = 0; i < rowIndex + 1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if(j == 0 || j == i)
                    list.add(1);
                else 
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.add(list);
        }
        //for(int v : result.get(rowIndex))
        //    System.out.print(v+" ");
        return result.get(rowIndex);
    }
}