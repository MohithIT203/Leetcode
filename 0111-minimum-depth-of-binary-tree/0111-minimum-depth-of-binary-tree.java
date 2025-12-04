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
    int minimumDepth(TreeNode root,int count){
        if(root==null){
            return Integer.MAX_VALUE; //to prevent null nodes with min depth
        }
        count++; //to add count of leaf node
        if(root.left==null && root.right==null){
            return count;
        }
        int left=minimumDepth(root.left,count);
        int right=minimumDepth(root.right,count);

        return Math.min(left,right);
    }

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return minimumDepth(root,0);
    }
}