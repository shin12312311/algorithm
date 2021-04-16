class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        ListNode tempHead = head;
        
        while(tempHead != null){
            returnList.add(tempHead.val);
            tempHead = tempHead.next;
        }
        
        int listSize = returnList.size();
        
        while(head != null){
            if(head.val != returnList.get(--listSize).intValue()){
                return false;
            }
                
            head = head.next;
        }
        
        return true;
    }
}
