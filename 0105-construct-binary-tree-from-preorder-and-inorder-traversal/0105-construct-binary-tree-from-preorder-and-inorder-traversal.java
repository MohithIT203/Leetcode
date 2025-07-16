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
    int index=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] pre,int[] in,int start,int end){
        if(start>end) return null;
        int preval=pre[index++];
        TreeNode root=new TreeNode(preval);
        int findInd=map.get(preval);
        root.left=helper(pre,in,start,findInd-1);
        root.right=helper(pre,in,findInd+1,end);

        return root;
    }
}