class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        //The componenet number approach
        int[] comp = new int[n];
        int lastComp = 1;
        comp[0] = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[i-1] > maxDiff){
                lastComp++;
            }
            comp[i] = lastComp;
        }    
        int len = queries.length;
        boolean[] answer = new boolean[len];
        for(int i = 0; i < len; i++){
            int u = queries[i][0];
            int v = queries[i][1];
            if(comp[u] == comp[v]){
                answer[i] = true;
            }
        }
        return answer;
    }
}