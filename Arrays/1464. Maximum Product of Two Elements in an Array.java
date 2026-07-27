class Solution {
    public int maxProduct(int[] nums) {
    // Find the maximum two values form the array 
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int n = nums.length;
    for(int i = 0; i < n; i++){
        if(nums[i] > max1){
            max2 = max1;
            max1 = nums[i];
        }else if( nums[i] > max2){
            max2 = nums[i];
        }
    }   
    return (max1-1)*(max2-1);
    }
}