/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next == null)return;

        int te = node.val;
        node.val = node.next.val;
        node.next.val = te;

        if(node.next.next == null){
            node.next = null;
            return;
        }

        deleteNode(node.next);
    }
}