class Solution {
    public int climbStairs(int n) {
        int[] a = new int[90];
        
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        
        if(n<=3){
            return a[n];
        }else{
            for(int i=4; i<=n; i++){
                a[i] = a[i-1] + a[i-2];
            }   
        }       
        
        return a[n];
    }
}
