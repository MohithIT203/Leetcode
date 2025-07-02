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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> arr=new HashSet<>();
        for(int n:nums) arr.add(n);
        while (head != null && arr.contains(head.val)) { //Remove beginning vals
            head = head.next;
        }
        ListNode ptr=head; 
        while(ptr!=null && ptr.next!=null){
            if(arr.contains(ptr.next.val)){
                ptr.next=ptr.next.next;
            }
            else{
            ptr=ptr.next;
            }
        }
        return head;
    }
}