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
    int helper(TreeNode root,int[] max){
        if(root==null){
            return 0;
        }
        //Math.max(..,0) - to handle mix of +ve and -ve nodes

        int left_sum = Math.max(helper(root.left,max),0);
        int right_sum = Math.max(helper(root.right,max),0);

        int path_sum = left_sum + right_sum + root.val;
        max[0] = Math.max(max[0],path_sum);
        return root.val + Math.max(left_sum,right_sum);

    }
    public int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        int h = helper(root,max);
        return max[0];
    }
}