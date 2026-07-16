class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            max = Math.max(num, max);
            prefixGcd[i] = gcd(num, max);
        }
        Arrays.sort(prefixGcd);
        int start = 0;
        int end = n-1;
        long sum = 0;
        while(start < end){
            int num1 = prefixGcd[start];
            int num2 = prefixGcd[end];
            sum += (long)gcd(num1, num2);
            start++;
            end--;
        }
        return sum;
    }
    public int gcd(int x, int y){
        return y == 0 ? x : gcd(y, x % y);
    }
}

//take Max value as Integer.MIN_VALUE as it will maintain the standard