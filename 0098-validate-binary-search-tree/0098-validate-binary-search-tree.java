/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Queue<Integer> queue=new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
       inorder(root);
       int prev=0,curr=0;
       prev=queue.poll();
       while(!queue.isEmpty()){
        curr=queue.poll();
        if(prev>=curr) return false;
        prev=curr;
       }
       return true;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        queue.add(root.val);
        inorder(root.right);
    }
}