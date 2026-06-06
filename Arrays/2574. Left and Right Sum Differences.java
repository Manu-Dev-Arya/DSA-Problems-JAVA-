class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int left = 0;
        int right = 0;
        for(int i = 0; i < n; i++){
            leftSum[i] = left;
            rightSum[n-1-i] = right;
            left += nums[i];
            right+= nums[n-1-i];
        }    
        
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}