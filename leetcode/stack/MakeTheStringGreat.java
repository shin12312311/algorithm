class Solution {
    public String makeGood(String s) {
        Stack<Character> a = new Stack<Character>();
        a.push(s.charAt(s.length()-1));
        
        for(int i=s.length()-2; i>=0; i--){
            if(!a.isEmpty()){
                if(a.peek() - s.charAt(i) == 32 || s.charAt(i) - a.peek() == 32){
                    a.pop();
                }else{
                    a.push(s.charAt(i));
                }
            }else
                a.push(s.charAt(i));
        }
        
        String aa = "";
        while(!a.isEmpty())
            aa += a.pop();
        return aa;
    }
}
