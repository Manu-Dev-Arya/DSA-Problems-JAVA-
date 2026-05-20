// Problem: 2657. Find the Prefix Common Array of Two Arrays
// Link: https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/?envType=daily-question&envId=2026-05-20

// Approach:
// Use HashTable

// Time Complexity: O(n) 
// Space Complexity: O(n) 

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] c = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(map.put(A[i], map.getOrDefault(A[i], 0) + 1) != null){
                count++;
            }
            if(map.put(B[i], map.getOrDefault(B[i], 0) + 1) != null){
                count++;
            }
            c[i] = count;
        }
        return c;
    }
}