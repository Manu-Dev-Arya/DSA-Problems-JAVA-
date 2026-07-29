class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = 0;
        for(int i = n-1; i >= 1; i--){
            if(nums[i] > nums[i-1]){
                pivot = i;
                break;
            }
        }
        if(pivot != 0){
            int i = n-1;
            while(i >= pivot){
                if(nums[i] > nums[pivot-1]){
                    int temp = nums[i];
                    nums[i]= nums[pivot-1];
                    nums[pivot-1] = temp;
                    break;
                }
                i--;
            }
        }
        int i = pivot;
        int j = n-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}