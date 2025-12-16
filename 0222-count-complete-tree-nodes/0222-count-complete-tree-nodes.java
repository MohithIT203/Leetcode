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
    int tot_nodes(TreeNode root){
        if(root==null) return 0;
        int left = tot_nodes(root.left);
        int right = tot_nodes(root.right);
        return 1+left+right;
    }
    public int countNodes(TreeNode root) {
        return tot_nodes(root);
    }
}