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
    int max=0;
    Map<Integer,Integer> map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        helper(root);
        List<Integer> li=new ArrayList<>();
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(max)){
                li.add(entry.getKey());
            }
        }
        int[] arr=new int[li.size()];
        for(int n:li) arr[i++]=n;
        return arr;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        max=Math.max(max,map.get(root.val));
        helper(root.right);
    }
}