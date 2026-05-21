// Problem: 2540. Minimum Common Value
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

