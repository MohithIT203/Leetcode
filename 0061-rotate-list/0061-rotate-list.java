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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int size=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            size++;
        }
        k=k%size;
        size-=k;
        ptr=head;
        for(int i=0;i<size-1 && ptr!=null ;i++){
            ptr=ptr.next;
        }
        
        ListNode temp=ptr;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        head=ptr.next;
        ptr.next=null;
        return head;
        
    }
}