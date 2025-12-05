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
    public List<Double> averageOfLevels(TreeNode root) {
        //Level-Order Traversal
        Queue<TreeNode> qu = new LinkedList<>();
        List<Double> average =new ArrayList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int level=qu.size();
            double sum=0.0;
            for(int i=0;i<level;i++){
                TreeNode node=qu.poll();
                sum+=node.val;
                if(node.left!=null){
                    qu.offer(node.left);
                }
                if(node.right!=null){
                    qu.offer(node.right);
                }
            }
            average.add(sum/level);
        }
        return average;
    }
}