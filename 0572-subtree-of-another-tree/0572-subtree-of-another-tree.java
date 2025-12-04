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
    boolean isSame(TreeNode root,TreeNode subroot){
        if(root==null && subroot==null) return true;
        if(root==null || subroot==null) return false;
        if(root.val!=subroot.val) return false;

        boolean left = isSame(root.left,subroot.left);
        boolean right = isSame(root.right,subroot.right);

        return left && right;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(root.val==subRoot.val){
            if(isSame(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        
    }
}