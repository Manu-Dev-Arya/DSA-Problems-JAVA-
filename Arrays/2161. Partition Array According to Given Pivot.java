// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         List<Integer> small = new ArrayList<>();
//         List<Integer> big = new ArrayList<>();
//         int n = nums.length;

//         for(int num: nums){
//             if(num < pivot){
//                 small.add(num);
//             } else if( num > pivot){
//                 big.add(num);
//             }
//         }
//         int i = 0;
//         while(i < small.size()){
//             nums[i] = small.get(i);
//             i++;
//         }
//         int equals = n - (small.size() + big.size());
//         while(i < equals + small.size()){
//             nums[i] = pivot;
//             i++;
//         }
//         while(i < small.size() + equals + big.size()){
//             nums[i] = big.get(i-(equals+small.size()));
//             i++;
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0;
        int j=nums.length-1;
        int ans[]=new int[nums.length];
        int i1=0;
        int j1=nums.length-1;
        while(i<nums.length&&j>=0){
            if(nums[i]<pivot){
                ans[i1++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[j1--]=nums[j];
            }
            i++;
            j--;
        }
        for(int k=i1;k<=j1;k++){
            ans[k]=pivot;
        }
        return ans;
    }
}