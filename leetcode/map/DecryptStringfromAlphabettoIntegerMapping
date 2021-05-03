class Solution {
    public String freqAlphabets(String s) {
        String r = "";
        
        Stack<Character> stack = new Stack<Character>();
        int sLength = s.length() - 1;
        
        while(sLength >= 0){
            char a = s.charAt(sLength);
            
            if(a == '#'){
                int num = Integer.parseInt(s.substring(sLength-2, sLength));
                char temp = (char)('a' + num - 1);
                stack.push(temp);
                sLength -= 3;
            }else{
                char temp = (char)('a' + a - '1');
                stack.push(temp);
                sLength--;   
            }
        }
        
        while (!stack.isEmpty())
            r += stack.pop();
        
        return r;
    }
}
