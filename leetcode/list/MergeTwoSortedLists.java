class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergeList = new ListNode();
        ListNode tempList = mergeList;
        
        while(l1 != null && l2 != null){            
                        
            if(l1.val >= l2.val){
                tempList.next = l2;
                l2 = l2.next;
            }else{
                tempList.next = l1;
                l1 = l1.next;
            }
            
            tempList = tempList.next;
        }
        
        if(l1 == null){ tempList.next = l2; }
        if(l2 == null){ tempList.next = l1; }

        return mergeList.next;
    }
}
