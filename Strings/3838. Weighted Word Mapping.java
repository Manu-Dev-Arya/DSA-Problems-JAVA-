class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder("");
        int n = words.length;
        for(int i = 0; i < n; i++){
            sb.append(weight(words[i], weights));
        }
        return sb.toString();
        
    }
    public char weight(String s, int[] weights){
        int len = s.length();
        int weight = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            weight += weights[ch - 'a'];
        }
        weight = weight % 26;
        return (char)(97+25-weight);
    }
}