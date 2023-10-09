class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }    
        ListNode a = head;
        ListNode b = head;
        while(b.next != null && b.next.next != null){
            a = a.next;
            b = b.next.next;
        }
        b = a.next;
        a.next = null;
        a = insertionSortList(head);
        b = insertionSortList(b);
        
        head = null;
        ListNode lastNode = null;
        while(a != null && b != null){
            if(a.val < b.val){
                if(lastNode == null){
                    head = a;
                } else {
                    lastNode.next = a;
                }
                lastNode = a;
                a = a.next;
            } else {
                if(lastNode == null){
                    head = b;
                } else {
                    lastNode.next = b;
                }
                lastNode = b;
                 b = b.next;
            }
        }
        if(a != null){
            lastNode.next = a;
        } else {
            lastNode.next = b;
        }
        
        return head;
    }
}