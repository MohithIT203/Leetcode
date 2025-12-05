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
    int max_dia=0;
    int diameter(TreeNode root){
        if(root==null) return 0;
        int left= diameter(root.left);
        int right = diameter(root.right);
        int dia = left+right;
        max_dia=Math.max(dia,max_dia); 
        return Math.max(left,right)+1; 
    }
    public int diameterOfBinaryTree(TreeNode root) {
       diameter(root);
       return max_dia;
    }
}