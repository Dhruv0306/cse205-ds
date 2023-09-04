/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int num=0;
        int rev=0;
        int mul=1;
        while(head!=null)
        {
        num=num*10+head.val;
        rev=head.val*mul+rev;
        mul*=10;
            head=head.next;
        }
        if(num==rev)
        {
            return true;
        }
        return false;
    }
}