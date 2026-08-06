class Solution {
    public int smallestNumber(int n, int t) {
        while(prodOfDigits(n) % t != 0){
            n++;
        }
        return n;
    }
    public int prodOfDigits(int n){
        int prod = 1;
        while(n > 0){
            int rem = n % 10;
            prod = prod * rem;
            n = n / 10;
            if(prod == 0){
                return 0;
            }
        }
        return prod;
    }
}