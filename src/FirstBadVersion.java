/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) return n;

        int low = 1;
        int high = n;
        int m = 0;
        int ans = 0;
        while(low <= high) {
            m = low + (high-low)/2;
            if(isBadVersion(m)) {
                high = m-1;
                ans = m;
            }
            else {
                low = m + 1;
            }
        }
        return ans;
    }
}