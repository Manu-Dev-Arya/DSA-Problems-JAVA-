// Problem: 1345.Jump Game 4
// Link: https://leetcode.com/problems/jump-game-iv/?envType=daily-question&envId=2026-05-18

// Approach(TLE solution):
// Use DFS and HashMap to store the indices of the same value in the array.

// Time Complexity: 
// Space Complexity: O(n) visited array and Queue is used 

class Solution {
    public int minJumps(int[] arr) { 
        int n = arr.length;
        boolean[] visited = new boolean[n];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.putIfAbsent(num, new ArrayList<>());
            map.get(num).add(i);
        } 
        visited[0] = true;
        int ans = rec(arr, visited, map, 0);
        return ans;
    }
    public int rec(int[] arr, boolean[] visited, HashMap<Integer, List<Integer>> map, int index){
        if(index == arr.length-1){
            return 0;
        }
        int num = arr[index];
        List<Integer> list = map.get(num);
        int min = Integer.MAX_VALUE;
        for(int i: list){
            if(!visited[i]){
                visited[i] = true;
                min = Math.min(min, rec(arr, visited, map, i));
                visited[i] =  false;
            }
        }

        if(index - 1 >= 0 && !visited[index-1]){
            visited[index-1] = true;
            min = Math.min(min, rec(arr, visited, map, index-1));
            visited[index-1] = false;
        }
        if(index + 1 < arr.length && !visited[index+1]){
            visited[index+1] = true;
            min = Math.min(min, rec(arr, visited, map, index+1));
            visited[index+1] = false;
        }
        return min == Integer.MAX_VALUE ? Integer.MAX_VALUE : min+1;
    }
}

