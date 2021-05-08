class Solution {
    public ListNode deleteDuplicates(ListNode head) {   
        if(head == null){
            return head;
        }
        
        ListNode temp = head;
        ListNode tempNext = temp.next;
        
        while(tempNext != null){
            tempNext = temp.next;
            if(temp.val == tempNext.val){
                temp.next = tempNext.next;
                tempNext = temp;            
            }
            temp = tempNext;
            tempNext = tempNext.next;            
        }
        
        return head;
    }
}
