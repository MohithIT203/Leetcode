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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int l=Height(root.left);
        int r=Height(root.right);
        if(Math.abs(l-r)>1) return false;
        return isBalanced(root.left)&& isBalanced(root.right);
    }
    public int Height(TreeNode n){
        if(n==null) return 1;
        int l=Height(n.left);
        int r=Height(n.right);
        return Math.max(l,r)+1;
    }
}