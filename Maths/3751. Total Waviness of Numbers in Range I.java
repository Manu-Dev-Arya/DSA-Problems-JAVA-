class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalWaviness = 0;
        while(num1 <= num2){
            totalWaviness += waviness(num1);
            num1++;
        }
        return totalWaviness;
    }
    public int waviness(int num){
        if(num < 100){
            return 0;
        }
        String s = String.valueOf(num);
        int prev = 0;
        int curr = 1;
        int next = 2;
        int waviness = 0;
        while( next < s.length()){
            int prevNum = (int)s.charAt(prev);
            int currNum = (int)s.charAt(curr);
            int nextNum = (int)s.charAt(next);
            if(prevNum < currNum && currNum > nextNum){
                waviness++;
            }
            if(prevNum > currNum && currNum < nextNum){
                waviness++;
            }
            prev++;
            curr++;
            next++;
        }
        return waviness;
    }
}

//Optimization in the above code:
//Do not create a new String Instance every time