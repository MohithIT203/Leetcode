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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode ptr = head.next;
        ListNode prev = head;
        while (ptr.next != null) {
            if (ptr.val != 0) {
                sum += ptr.val; 
                
            } else {
                prev.val = sum;
                prev.next = ptr.next;
                prev = prev.next;
                sum =0;
            }
            ptr = ptr.next; 
              
        }
        prev.val=sum;
        prev.next = null;
        return head;
    }
}