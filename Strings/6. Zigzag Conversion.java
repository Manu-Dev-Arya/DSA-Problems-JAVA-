class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 ){
            return s;
        }
        int len = s.length();
        ArrayList<Character>[] result = new ArrayList[numRows];
        for(int i = 0; i < numRows; i++){
            result[i] = new ArrayList<>();
        }

        int d = 0;
        int index = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(index == 0){
                d = 1;
            }
            if(index == numRows-1){
                d = -1;
            }
            result[index].add(ch);
            index += d;
        } 

        //now Traverse the array of ArrayList to get to the answer 
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < numRows; i++){
            ArrayList<Character> list = result[i];
            for(char ch: list){
                sb.append(ch);
            }
        }  
        return sb.toString();
    }
}