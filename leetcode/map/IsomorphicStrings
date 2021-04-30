class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> map = new HashMap<String, String>();
        
        for(int i=0; i<s.length(); i++){
            String sItem=s.substring(i,i+1), tItem=t.substring(i, i+1);
            
            if(map.containsKey(sItem) && !(map.get(sItem)).equals(tItem)){
                return false;
            }else if(map.containsValue(tItem)){
                Iterator<String> keys = map.keySet().iterator();
                while (keys.hasNext()){
                    String key = keys.next();
                    if((map.get(key)).equals(tItem) && !key.equals(sItem)){
                     return false;   
                    }
                }
            }
            else{
                map.put(sItem, tItem);    
            }
        }
        
        return true;
    }
}
