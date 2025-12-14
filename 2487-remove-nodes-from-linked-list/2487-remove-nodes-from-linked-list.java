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
    int max_node = Integer.MIN_VALUE;
    int rem_node(ListNode head,ListNode prev){
        if(head==null) return Integer.MIN_VALUE;

        int right_max = rem_node(head.next,head);
      
        if(right_max>head.val){
            if(prev!=null)
            prev.next=head.next;
        }
        return Math.max(right_max,head.val);
    }
    public ListNode removeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        rem_node(head,dummy);
        return dummy.next;
    }
}