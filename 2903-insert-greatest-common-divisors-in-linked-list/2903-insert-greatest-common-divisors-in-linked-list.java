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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode ptr = head;
        while (ptr.next != null) {
            int n = gcd(ptr.val, ptr.next.val);
            ListNode newNode = new ListNode(n);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = ptr.next.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}