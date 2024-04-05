public class ClimbStairs {
    public int climbStairs(int n) {
        int[] diffWays = new int[n+1];
        diffWays[0] = 1;
        diffWays[1] = 1;

        for(int i = 0; i < n+1; i++) {
            if(i >= 2) {
                diffWays[i] = diffWays[i-1] + diffWays[i-2];
            }
        }

        return diffWays[n];
    }
}