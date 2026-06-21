class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int iceCreams = 0;
        for(int cost: costs){
            if(cost <= coins){
                iceCreams++;
                coins -= cost;
            }
        }    
        return iceCreams;
    }
}