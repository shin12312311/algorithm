class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> t1 = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++){
            Character temp = s.charAt(i);
            if(temp != '#'){
                s1.push(temp);    
            }else if(!s1.isEmpty()){
                s1.pop();
            }
        }
        
        for(int i=0; i<t.length(); i++){
            Character temp = t.charAt(i);
            if(temp != '#'){
                t1.push(temp);    
            }else if(!t1.isEmpty()){
                t1.pop();
            }
        }
        
        while(!s1.isEmpty() && !t1.isEmpty()){
            if(s1.pop() != t1.pop())
                return false;
        }
        
        if(!s1.isEmpty() || !t1.isEmpty())
            return false;
        
        return true;
    }
}
