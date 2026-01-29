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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root==null) return level;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(queue.size()>0){
            int l = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode node =queue.poll();
                temp.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            level.add(temp);
        }
        return level;
    }
}