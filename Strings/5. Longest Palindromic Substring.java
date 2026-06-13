
// Link: https://leetcode.com/problems/longest-palindromic-substring/description/

// Approach:
// Brute force 

// Time Complexity: O(n^2) where n is the length of the string
// Space Complexity: O(1) only using a few variables

class Solution {
    public String longestPalindrome(String s) {
        // Brute force is to check for palidrome for every substring
        // use StringBuilder for memory Efficency 
        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                sb.setLength(0);
                for(int k = i; k <= j; k++){
                    sb.append(s.charAt(k));
                }
                if(isPalindrome(sb) && str.length() < sb.length()){
                    str = new StringBuilder(sb);;
                }
            }
        }
        return str.toString();
    }
    public boolean isPalindrome(StringBuilder sb){
        int len = sb.length();
        int i = 0;
        while(i < len/2){
            if(sb.charAt(i) != sb.charAt(len-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}



class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int[] ans = new int[] { 0, 0 };
        boolean[][] dp = new boolean[len][len];
        for(int i = 0; i < len; i++){
            dp[i][i] = true;
        }    
        for(int i = 1; i < len; i++){
            if(s.charAt(i-1) == s.charAt(i)){
                dp[i-1][i] = true;
                ans[0] = i-1;
                ans[1] = i;
            }
        }
        
        for (int diff = 2; diff < len; diff++) {
            for (int i = 0; i < len - diff; i++) {
                int j = i + diff;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        int i = ans[0];
        int j = ans[1];
        return s.substring(i, j + 1);
    }
}