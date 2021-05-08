class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length+1];
        
        minCost[0] = 0;
        minCost[1] = 0;
        
        for(int i=2; i<=cost.length; i++){
            int tempA = minCost[i-2] + cost[i-2];
            
            minCost[i] = tempA > minCost[i-1] + cost[i-1] ? minCost[i-1] + cost[i-1] : tempA;
        }
        
        return minCost[cost.length];
    }
}
