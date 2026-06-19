class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currAltitude = 0;
        for(int gn: gain){
            int altitude = currAltitude + gn;
            currAltitude = altitude;
            if(altitude > maxAltitude){
                maxAltitude = altitude;
            }
        }        
        return maxAltitude;
    }
}