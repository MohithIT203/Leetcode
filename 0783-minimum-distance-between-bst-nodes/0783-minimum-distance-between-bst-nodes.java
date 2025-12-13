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
    TreeNode prev=null;
    int min_val=Integer.MAX_VALUE;
    void min_diff(TreeNode root){
        if(root==null) return;
        min_diff(root.left);
        if(prev!=null){
            min_val=Math.min(Math.abs(prev.val-root.val),min_val);
        }
        prev=new TreeNode(root.val);
        min_diff(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        min_diff(root);
        return min_val;
    }
}