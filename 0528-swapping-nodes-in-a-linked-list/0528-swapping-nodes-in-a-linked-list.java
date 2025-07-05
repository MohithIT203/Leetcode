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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int size=1;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        size-=k;
        ListNode ptr1=head;
        ListNode ptr2=head;
        while(k>1){
            ptr1=ptr1.next;
            k--;
        }
        while(size>1){
            ptr2=ptr2.next;
            size--;
        }
        int t=ptr1.val;
        ptr1.val=ptr2.val;
        ptr2.val=t;

        return head;

    }
}