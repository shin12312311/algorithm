class Solution {
    public String removeDuplicates(String s) {
        String[] a = new String[s.length()+1];
        a[0] = s.substring(0, 1);
        int j = 1;
        
        for(int i=1; i<s.length(); i++, j++){
            a[j] = s.substring(i, i+1);
            
            if(j>=1){
                if(a[j].equals(a[j-1])){
                    j -= 2;
                }
            }
        }
        
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<j; i++) {
            builder.append(a[i]);
        }  
        
        return builder.toString();
    }
}
