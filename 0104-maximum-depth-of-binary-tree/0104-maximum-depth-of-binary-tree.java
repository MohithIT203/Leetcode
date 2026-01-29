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
    int helper(TreeNode root){
        if(root==null) return 0;

        int left_height = helper(root.left);
        int right_height = helper(root.right);

        return 1+Math.max(left_height,right_height);
    }
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
}