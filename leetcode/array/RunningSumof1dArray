class Solution {
    public int[] runningSum(int[] nums) {
        int[] returnArray = new int[nums.length];
        
        returnArray[0] = nums[0];
        
        for(int i=1; i < nums.length; i++){
            returnArray[i] = returnArray[i-1] + nums[i];
        }
        
        return returnArray;
    }
}
