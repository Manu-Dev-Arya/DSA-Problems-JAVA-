class Solution {
    public int maximumProduct(int[] nums) {
    //Product maximizes when all three are positive or the two are negatives and one is the positive one  
    Arrays.sort(nums);
    int n = nums.length;
    int prod1 = nums[0]* nums[1]*nums[n-1];
    int prod2 = nums[n-3]* nums[n-2] * nums[n-1];
    return prod1 > prod2 ? prod1 : prod2; 
    }
}