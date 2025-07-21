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
    int count=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int left=maxHeight(root.left);
        int right=maxHeight(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(left + right, Math.max(leftDiameter, rightDiameter));
    }
    public int maxHeight(TreeNode root){
        if(root==null) return 0;
        return Math.max(maxHeight(root.left),maxHeight(root.right))+1;
    }
}