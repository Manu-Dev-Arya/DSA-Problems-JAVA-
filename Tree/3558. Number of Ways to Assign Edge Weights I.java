class Solution {
    private static final int MOD = 1_000_000_007;
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length+1;
        ArrayList<Integer>[] lists = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++){
            lists[i] = new ArrayList<>();
        }
        for(int i = 0; i < n-1; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            lists[u].add(v);
            lists[v].add(u);
        }
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(-1);
        visited[1] = true;
        int depth = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == -1 ){
                if(!q.isEmpty()){
                    depth++;
                    q.add(-1);
                    continue;
                }else{
                    break;
                }
            }
            ArrayList<Integer> list = lists[node];
            for(int ele: list){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele] = true;
                }
            }
        }
        return qpow(2, depth-1);
    }
    private int qpow(int x, int y) {
        long res = 1;
        long base = x;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            y >>= 1;
        }
        return (int) res;
    }
}