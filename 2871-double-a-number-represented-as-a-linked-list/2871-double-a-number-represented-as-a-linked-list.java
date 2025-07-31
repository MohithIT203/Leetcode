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
    public ListNode doubleIt(ListNode head) {
        ListNode ptr=reverse(head);
        ListNode fin=new ListNode();
        ListNode temp=fin;
        int carry=0,n1=0;
        while(ptr!=null||carry!=0){
            if(ptr!=null){
               n1=ptr.val;
               ptr=ptr.next;
            }
            else{
                n1=0;
            }
            int sum=n1*2+carry;
            carry=sum/10;
            ListNode newNode=new ListNode(sum%10);
            fin.next=newNode;
            fin=fin.next;
        }
        return reverse(temp.next);
    }
    public ListNode reverse(ListNode head){
        ListNode newhead=null;
        while(head!=null){
            ListNode newNode=new ListNode(head.val);
            if(newhead==null){
                newhead=newNode;
            }
            else{
                newNode.next=newhead;
                newhead=newNode;
            }
            head=head.next;
        }
        return newhead;
    }
}