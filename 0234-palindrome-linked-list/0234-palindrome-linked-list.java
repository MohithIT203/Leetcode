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
    ListNode reverse;
    public void insert(int v){
        ListNode newNode=new ListNode(v);
        if(reverse==null){
            reverse=newNode;
            return;
        }
        newNode.next=reverse;
        reverse=newNode;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode ptr=head;
        while(ptr!=null){
            insert(ptr.val);
            ptr=ptr.next;
        }
        
        ListNode ptr1=head;
        ListNode ptr2=reverse;
       while(ptr1!=null && ptr2!=null){
        if(ptr1.val!=ptr2.val){
            return false;
        }
        ptr1=ptr1.next;
        ptr2=ptr2.next;
       }
       
    return true;
    }
}