class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode[] temp = new ListNode[100];
        int nodeSize = 0;
       
        while(head != null){
            temp[nodeSize] = head;
            head = head.next;
            nodeSize++;
        }
        
        return temp[nodeSize/2];  
    }
}
