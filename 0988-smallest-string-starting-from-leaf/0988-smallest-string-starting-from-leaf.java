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
    String min_string="{";
    void helper(TreeNode root,String str){
        if(root==null) return;
        str+=(char)(root.val+97);
        if(root.left==null&& root.right==null){
            StringBuilder sb = new StringBuilder(str);
            String reversedString=sb.reverse().toString(); 
            if(reversedString.compareTo(min_string)<0){
                min_string=reversedString;
            }
            return;
        }
        helper(root.left,str);
        helper(root.right,str);
    }
    public String smallestFromLeaf(TreeNode root) {
        helper(root,"");
        return min_string;
    }
}