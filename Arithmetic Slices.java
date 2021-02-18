class Solution {

    // TC : O(n)
    // SC : O(n)
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        int total = 0;
        for(int i=2;i<A.length;i++){
            if(A[i] - A[i-1] == A[i-1] - A[i-2]){
                dp[i] = dp[i-1]+1;
            } else{
                dp[i] = 0;
            }
            total += dp[i];
        }
        return total;
    }

}