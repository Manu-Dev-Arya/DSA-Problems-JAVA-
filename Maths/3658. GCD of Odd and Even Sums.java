class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int num = 1;
        while(n != 0){
            oddSum += num;
            evenSum += (num+1);
            num += 2;
            n--;
        }
        return GCD(oddSum, evenSum);
    }
    public int GCD(int x, int y){
        int gcd = 1;
        int limit = Math.min(x,y);
        for(int i = 2; i <= limit; i++){
            if(x % i == 0 && y % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}

//TimeComplexity 
n + min(oddSum + evenSum);
min(oddSum, evenSum);

//Space Complexity
O(1)

class Solution {

    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}