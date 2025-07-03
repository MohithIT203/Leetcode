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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ||head.next==null) return null;
        int count=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        count-=n;
        if(count==0) head=head.next;
        ptr=head;
        while(ptr!=null && count!=1){
            ptr=ptr.next;
            count--;
        }
        if(ptr!=null)
        ptr.next=ptr.next.next;

        return head;
    }
}