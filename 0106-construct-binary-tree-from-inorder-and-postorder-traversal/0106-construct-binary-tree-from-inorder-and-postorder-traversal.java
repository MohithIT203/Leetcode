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
    int ind=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ind=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,postorder.length-1);
    }
    public TreeNode helper(int[] in,int[] post,int start,int end){
        if(start>end) return null;
        int postval=post[ind--];
        TreeNode root=new TreeNode(postval);
        int findInd=map.get(postval);
        root.right=helper(in,post,findInd+1,end);
        root.left=helper(in,post,start,findInd-1);

        return root;
    }
}