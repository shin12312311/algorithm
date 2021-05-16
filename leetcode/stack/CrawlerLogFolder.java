class Solution {
    public int minOperations(String[] logs) {
        int step = 0;
        for(String i : logs){
            if(i.equals("../")){
                step = step == 0 ? 0 : step - 1;
            }else if(!i.equals("./")){
                step++;
            }
        }
        return step;
    }
}
