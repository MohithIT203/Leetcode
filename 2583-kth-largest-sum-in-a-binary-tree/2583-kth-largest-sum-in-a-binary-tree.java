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
    public long kthLargestLevelSum(TreeNode root, int k) {
        //Level-Order Traversal
        Queue<TreeNode> qu = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>(); 
        int levels =1;
        qu.offer(root);
        while(!qu.isEmpty()){
            levels++;
            int level=qu.size();
            long sum=0;
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
            pq.add(sum);
            if(pq.size()>k){ //remove extra elements
                pq.poll();
            }
            
        }
        if(levels<=k){
            return -1;
        }
        return pq.peek();
    }
}