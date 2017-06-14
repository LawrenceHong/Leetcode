/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;
        while(i < j) {
            int mid = i + (j - i)/2;
            if(!isBadVersion(mid)) i = mid + 1;
            else j = mid;
        }
        
        return i;
    }
}