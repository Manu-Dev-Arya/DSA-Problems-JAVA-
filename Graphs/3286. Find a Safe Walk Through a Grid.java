class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        Queue<int[]> q = new LinkedList<>();
        int[][] direction = new int[][]{{1,0},{0,-1},{-1,0},{0,1}};
        int[][] best = new int[m][n];
        if(grid.get(0).get(0) == 1){
            health -= 1;
        }    
//         if (health <= 0) {
//     return false;
// }
        q.add(new int[]{0,0,health});
        best[0][0] = health;
        while(!q.isEmpty()){
            

            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];
            int h = curr[2];

            if(i == m-1 && j == n-1){
                return true;
            }
            for(int[] dir: direction){
                int x = i + dir[0];
                int y = j + dir[1];
                if(isValid(x,y,m,n)){
                    int dirHealth = h - grid.get(x).get(y);
//                     if (dirHealth <= 0) {
//     continue;
// }
                    if(best[x][y] < dirHealth){
                        best[x][y] = dirHealth;
                        q.add(new int[]{x,y,dirHealth});
                    }
                }
            }
        }
        return false;
    }
    public boolean isValid(int x, int y, int m, int n){
        if(x < 0 || x >= m || y < 0 || y >= n){
            return false;
        }else{
            return true;
        }
    }
}