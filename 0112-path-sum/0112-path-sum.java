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
    boolean SumPath(TreeNode root,int target,int sum){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            if(sum+root.val==target) return true;
        }
        return SumPath(root.left,target,sum+root.val)||SumPath(root.right,target, sum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return SumPath(root,targetSum,0);
    }
}