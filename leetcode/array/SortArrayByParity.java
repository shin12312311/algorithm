class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] returnArray = new int[A.length];
        int tempLength1 = 0;
        int tempLength2 = A.length - 1;
        
        for(int i=0; i<A.length; i++){
            if(A[i] % 2 == 0){
                returnArray[tempLength1] = A[i];
                tempLength1++;
            }else{
                returnArray[tempLength2] = A[i];
                tempLength2--;
            }
        }
        
        return returnArray;
    }
}
