class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < n; i++){
            int num = nums[i];
            if(num > max){
                max = num;;
            }
            if(num < min){
                min = num;
            }
        }
        return (long)(max-min) * k;    
    }
}