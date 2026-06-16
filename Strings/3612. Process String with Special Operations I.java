class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder("");
        int len = s.length();

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            int sbLen = sb.length();
            if(ch == '*'){
                if(sbLen > 0){
                    sb.deleteCharAt(sbLen-1);
                }
            }else if( ch == '#'){
                sb.append(sb.toString());
            }else if(ch == '%'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        } 
        return sb.toString();
    }
}