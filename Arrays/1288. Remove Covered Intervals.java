class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        boolean[] notToKeep = new boolean[n];
        int count = 0;
        for(int i = 0; i < n-1; i++){
            int currIntervalStart = intervals[i][0];
            int currIntervalEnd = intervals[i][1];

            for(int j = i+1; j < n; j++){
                int compIntervalStart = intervals[j][0];
                int compIntervalEnd = intervals[j][1];
                //if currInterval is inclusive into the compInterval
                if(compIntervalStart <= currIntervalStart && compIntervalEnd >= currIntervalEnd){
                    notToKeep[i] = true;
                }
                if(currIntervalStart <= compIntervalStart && currIntervalEnd >= compIntervalEnd){
                    notToKeep[j] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(!notToKeep[i]){
                count++;
            }
        }
        return count;
    }
}