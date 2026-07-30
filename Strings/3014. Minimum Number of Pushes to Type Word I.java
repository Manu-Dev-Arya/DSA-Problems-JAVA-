class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int q = len / 8;
        int rem = len % 8;
        int a = (q * (q + 1)) / 2;
        return a * 8 + (q + 1) * rem;
    }
}