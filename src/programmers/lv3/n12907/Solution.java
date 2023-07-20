package programmers.lv3.n12907;
class Solution {
    public int solution(int n, int[] money) {
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=0;i<money.length;i++) {
            for(int j=money[i];j<=n;j++) {
                dp[j] += dp[j-money[i]];
            }
        }

        return dp[n];
    }
}
