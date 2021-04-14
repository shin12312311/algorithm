class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode temp1 = head;
        ListNode temp2 = null;
        
        while(temp1 != null){      
            ListNode nextTemp = temp1.next;
            temp1.next = temp2;
            temp2 = temp1;
            temp1 = nextTemp;
        }
        
        return temp2;
    }
}
