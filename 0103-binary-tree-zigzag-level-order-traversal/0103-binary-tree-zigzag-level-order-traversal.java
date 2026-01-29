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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root==null) return level;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count=0;
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
            //reverse odd levels
            if(count%2==1){
                Collections.reverse(temp);
            }
            level.add(temp);
            count++;
        }
        return level;
    }
}