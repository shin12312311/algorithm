class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length-1;
        int[] temp = new int[nums.length];       
        
        for(int i=nums.length-1; i>=0; i--){
            if(nums[start]*nums[start] > nums[end]*nums[end]){
                temp[i] = nums[start] * nums[start];
                start++;    
            }else{
                temp[i] = nums[end] * nums[end];
                end--;
            }
        }
            
        return temp;
    }
}
