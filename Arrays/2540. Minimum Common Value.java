// Problem: 2540. Minimum Common Value
// Link: https://leetcode.com/problems/minimum-common-value/description/?envType=daily-question&envId=2026-05-19

// Approach:
// Two Pointer Similar to merge two sorted arrays

// Time Complexity: O(n + m) where n and m are the lengths of the two arrays
// Space Complexity: O(1) only using two pointers

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        while( i < n1 && j < n2){
            int num1 = nums1[i];
            int num2 = nums2[j];
            if(num1 == num2){
                return num1;
            }else if(num1 > num2){
                j++;
            }else{
                i++;
            }
        }    
        return -1;
    }
}