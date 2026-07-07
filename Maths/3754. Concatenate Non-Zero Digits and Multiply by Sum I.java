class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            if(rem != 0){
                x = x * 10 + rem;
                sum += rem;
            }
            n = n / 10;
        }  
        x = reverse(x);
        return x * sum;  
    }
    public long reverse(long n){
        long num = 0;

        while(n != 0){
            int rem = (int)n % 10;
            num = num * 10 + rem;
            n = n / 10;
        }

        return num;
    }
}