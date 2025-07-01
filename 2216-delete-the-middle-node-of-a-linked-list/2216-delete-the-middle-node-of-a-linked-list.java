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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode ptr=head;
        ListNode slow=ptr;
        ListNode fast=ptr;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        while(ptr!=null){
            if(ptr.next==slow){
                ptr.next=slow.next;
            }
            ptr=ptr.next;
        }
        
        return head;

    }
}