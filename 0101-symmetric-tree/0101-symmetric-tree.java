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
    boolean Subtree(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) {
            return false;
        }

        boolean left = Subtree(root1.left,root2.right);
        boolean right = Subtree(root1.right,root2.left);

        return left&& right;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null) return true;
        return Subtree(root.left,root.right);
       
    }
}