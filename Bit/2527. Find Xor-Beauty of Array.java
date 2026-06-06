class Solution {
    public int xorBeauty(int[] nums) {
        int n = nums.length;
        int xorRes = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    int ele1 = nums[i];
                    int ele2 = nums[j];
                    int ele3 = nums[k];
                    int num = (ele1 | ele2) & ele3;
                    xorRes = xorRes ^ num;
                }
            }
        }
        return xorRes;
    }
}

class Solution {
    public int xorBeauty(int[] nums) {
        int n = nums.length;
        int xorRes = 0;
        for(int i = 0; i < n; i++){
            xorRes = xorRes ^ nums[i];
        }
        return xorRes;
    }
}