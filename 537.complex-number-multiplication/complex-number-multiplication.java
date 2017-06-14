public class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] c1 = Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        int[] c2 = Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        return (c1[0]*c2[0] - c1[1]*c2[1]) + "+" + (c1[0]*c2[1] + c1[1]*c2[0]) + "i";
    }
}