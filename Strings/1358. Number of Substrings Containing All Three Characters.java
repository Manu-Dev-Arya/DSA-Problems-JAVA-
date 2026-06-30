class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length();
        int[] arrA = new int[len+1];
        int[] arrB = new int[len+1];
        int[] arrC = new int[len+1];
        arrA[len] = -1;
        arrB[len] = -1;
        arrC[len] = -1;

        for(int i = len-1; i >=0; i--){
            char ch = s.charAt(i);
            if(ch == 'a'){
                arrA[i] = i;
                arrB[i] = arrB[i+1];
                arrC[i] = arrC[i+1];
            }else if(ch == 'b'){
                arrA[i] = arrA[i+1];
                arrB[i] = i;
                arrC[i] = arrC[i+1];
            }else{
                arrA[i] = arrA[i+1];
                arrB[i] = arrB[i+1];
                arrC[i] = i;
            }
        }
        int count = 0;
        for(int i = 0; i < len; i++){
            int idxA = arrA[i];
            int idxB = arrB[i];
            int idxC = arrC[i];
            if(idxA == -1 || idxB == -1 || idxC == -1){
                break;
            }else{
                int idx = Math.max(idxA, Math.max(idxB, idxC));
                count+= len-idx;
            }
        }
        return count;
    }
}