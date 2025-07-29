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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        ListNode newNode=new ListNode();
        ListNode tptr=newNode;
        ListNode temp=tptr;
        int carry=0,n1=0,n2=0;
        while(ptr1!=null || ptr2!=null ||carry!=0){
            if(ptr1!=null){
                n1=ptr1.val;
                ptr1=ptr1.next;
            }
            else{
                n1=0;
            }
            if(ptr2!=null){
                n2=ptr2.val;
                ptr2=ptr2.next;
            }
            else{
                n2=0;
            }
            int sum=n1+n2+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            if(tptr==null){
                tptr=node;
            }
            else{
                tptr.next=node;
                tptr=tptr.next;
            }
            
        }
        return temp.next;
    }
}