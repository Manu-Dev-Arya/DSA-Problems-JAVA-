class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int num = nums[0];
        for(int i = 1; i < n; i++){
            while(nums[i] != num + 1){
                num = num+1;
                list.add(num);
            }
            num++;
        }
        return list;
    }
}