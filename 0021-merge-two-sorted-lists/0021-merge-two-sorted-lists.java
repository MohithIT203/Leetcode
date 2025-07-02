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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return list1;
        ListNode newList=new ListNode();
        ListNode ptr=newList;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ptr.next=list1;
                list1=list1.next;
            }
            else {
                ptr.next=list2;
                list2=list2.next;
            }
            ptr=ptr.next;
        }
        //add remaining nodes
        if(list1!=null){
            ptr.next=list1;
        }
        else{
            ptr.next=list2;
        }
        //skip head node
        return newList.next;
    }
}