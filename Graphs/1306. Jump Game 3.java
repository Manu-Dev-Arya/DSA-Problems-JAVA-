// Problem: 1306.Jump Game 3
// Link: https://leetcode.com/problems/jump-game-iii/description/?envType=daily-question&envId=2026-05-17

// Approach:
// Use BFS/DFS 

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean canReach(int[] arr, int start) {  
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int index = q.remove();
            if(arr[index] == 0){
                return true;
            }
            int left = index - arr[index];
            int right = index + arr[index];
            if(left >= 0 && !visited[left]){
                q.add(left);
                visited[left] = true;
            }
            if(right < n && !visited[right]){
                q.add(right);
                visited[right] = true;
            }

        }  
        return false;    
    }
}