class Solution {
    public String smallestPalindrome(String s) {
   int[] c = new int[26];
    int len = s.length();
    for(int i = 0; i < len; i++){
        char ch = s.charAt(i);
        c[ch-'a']++;
    }
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < 26; i++){
        while(c[i] / 2 != 0){
            sb.append((char)('a' + i));
            c[i] -= 2;
        }
    }
    String str = sb.toString();
    for(int i = 0; i < 26; i++){
        if(c[i] != 0){
            sb.append((char)('a' + i));
        }
    }
    String reversed = new StringBuilder(str).reverse().toString();
    sb.append(reversed);
    return sb.toString();
    }
}