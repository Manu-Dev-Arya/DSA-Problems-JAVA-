class Solution {
    public int reverse(int x) {
        int[] numRev = rev(x);
        int numRevRev = rev(numRev);
        return x == numRevRev ? numRev[0] : 0;    
    }
    public int[] rev(int x){
        int[] result = new int[2];
        int num = 0;
        int count = 0;
        while(x != 0){
            int rem = x % 10;
            num = num * 10 + rem;
            x = x / 10;
            count++;
        }
        result[0] = num;
        result[1] = count;
        return result;
    }
    public int rev(int[] numRev){
        int num = numRev[0];
        int count = numRev[1];
        int[] response = rev(num);
        return response[0] * (int)(Math.pow(10, (count-response[1])));
    }
}


//Another Approach

class Solution {
    public int reverse(int x) {
        int num = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(x != 0){
            int rem = x % 10;
            if(rem < 0){
                if(num < min/10 || (num == min/10 && rem < -8)){
                    return 0;
                }
            }else{
                if(num > max/10 || (num == max/10 && rem > 7)){
                    return 0;
                }
            }
            num = num * 10 + rem;
            x = x / 10;
        }
        return num;
    }
    
}