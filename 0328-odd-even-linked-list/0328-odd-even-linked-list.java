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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
      int size=1;
      ListNode ptr=head;
      ListNode Eve=null,t=null;
      while(ptr.next!=null){
        Eve=ptr;
        ptr=ptr.next;
        size++;
      }
      int temp=size/2;
      ListNode ptr1=head;
      while(temp!=0){
        ptr.next=ptr1.next;
        ptr1.next=ptr1.next.next;
        ptr1=ptr1.next;
        ptr=ptr.next;
        temp--;
      }
     
      ptr.next=null;
      return head;
    }
}