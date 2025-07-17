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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
	    if(key>root.val){
	        root.right=deleteNode(root.right,key);
	    }
	    else if(key<root.val){
	        root.left=deleteNode(root.left,key);
	    }
	    else{
	        //for leaf node
	        if(root.left==null && root.right==null){
	            root=null;
	            return root;
	        }
	        //has only one child node
	        else if(root.left==null){
	            return root.right;
	        }
	        else if(root.right==null){
	            return root.left;
	        }
	        //for deleting node with two child(replace with min ele in right subtree)
	        else{
	            TreeNode minNode=findmin(root.right);
	            root.val=minNode.val;
	            root.right=deleteNode(root.right,minNode.val); //delete the element replaced with root
	        }
	    }
	    return root;
    }
    	public TreeNode findmin(TreeNode n){
	    while(n.left!=null){
	        n=n.left;
	    }
	    return n;
	}
}