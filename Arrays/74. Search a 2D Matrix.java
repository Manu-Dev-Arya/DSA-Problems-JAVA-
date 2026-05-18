// Problem: 74. Search a 2D Matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/description/

// Approach:
// Binary Search 

// Time Complexity: O(log(m*n)) where m is the number of rows and n is the number of columns
// Space Complexity: O(1) No extra space is used

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n -1;

        while(start <= end){
            int mid = (end-start)/2 + start;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] ==  target){
                return true;
            }else if( matrix[row][col] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }    
        return false;   
    }
}