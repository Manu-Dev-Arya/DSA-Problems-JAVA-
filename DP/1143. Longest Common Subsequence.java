class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m]; 
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return common(text1, text2, 0, 0, dp);

    }
    public int common(String text1, String text2, int index1, int index2, int[][] dp){
        if(index1 == text1.length() || index2 == text2.length()){
            return 0;
        }
        if(dp[index1][index2] != -1){
            return dp[index1][index2];
        }
        char ch1 = text1.charAt(index1);
        char ch2 = text2.charAt(index2);
        if(ch1 == ch2){
            return dp[index1][index2] = common(text1, text2, index1 + 1, index2 + 1, dp) + 1;
        }
        return dp[index1][index2] = Math.max(common(text1, text2, index1, index2 + 1, dp), common(text1, text2, index1 + 1, index2, dp));
    }
}