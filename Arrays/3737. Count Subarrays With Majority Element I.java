class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            int freq = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == target){
                    freq++;
                }
                if(2 * freq > (j-i+1)){
                    count++;
                }
            }
        } 
        return count;   
    }
}