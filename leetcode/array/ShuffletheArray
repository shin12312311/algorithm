class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] returnArray = new int[nums.length];
        int x = 0;
        
        for(int i=0; i<n; i++){
            returnArray[x] = nums[i];
            x++;
            returnArray[x] = nums[n+i];
            x++;
        }
        
        return returnArray;
    }
}
