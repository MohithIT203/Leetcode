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
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        Stack<Integer> res=new Stack<>();
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        ListNode fin=new ListNode();
        ListNode tptr=fin;
        while(ptr1!=null){
            stack1.push(ptr1.val);
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            stack2.push(ptr2.val);
            ptr2=ptr2.next;
        }
        int carry=0;
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry!=0){
            int n1=(!stack1.isEmpty())?stack1.pop():0;
            int n2=(!stack2.isEmpty())?stack2.pop():0;
            int sum=n1+n2+carry;
            carry=sum/10;
            res.push(sum%10);
        }
        while(!res.isEmpty()){
            ListNode newNode=new ListNode(res.pop());
            tptr.next=newNode;
            tptr=tptr.next;
        }
        return fin.next;
    }
}