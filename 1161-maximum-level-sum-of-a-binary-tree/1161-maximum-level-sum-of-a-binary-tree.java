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
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        int max_sum = Integer.MIN_VALUE;
        int level = 0,ind=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (queue.size() > 0) {
            int l = queue.size();
            int level_sum = 0;
            for (int i = 0; i < l; i++) { //traverse level elements
                TreeNode node = queue.poll();
                level_sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ind++; //level
            
            if (level_sum > max_sum) {
                max_sum = level_sum;
                level = ind;
            }
        }
        return level;
    }
}