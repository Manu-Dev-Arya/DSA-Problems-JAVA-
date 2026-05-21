// Problem: 3043. Find the Length of the Longest Common Prefix

// Approach:
// Usse HashTable to store prefixes of the first array and then check for the longest prefix in the second array

// Time Complexity: O((n1+n2) * 10) 
// Space Complexity: O(n1 * 10) 

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> set = new HashSet<>();

        // Store all prefixes of arr1 numbers
        for(int num : arr1){
            String s = String.valueOf(num);

            String prefix = "";

            for(char ch : s.toCharArray()){
                prefix += ch;
                set.add(prefix);
            }
        }

        int longest = 0;

        // Check prefixes from arr2
        for(int num : arr2){
            String s = String.valueOf(num);

            String prefix = "";

            for(int i = 0; i < s.length(); i++){
                prefix += s.charAt(i);

                if(set.contains(prefix)){
                    longest = Math.max(longest, i + 1);
                }
            }
        }

        return longest;
    }
}