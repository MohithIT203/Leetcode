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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null){
            list.add(ptr.val);
            ptr=ptr.next;
        }
        int arr[]=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=list.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()) arr[i]=0;
            else{
                arr[i]=stack.peek();
            }
            stack.push(list.get(i));
        }
        return arr;
    }
}