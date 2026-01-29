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
        List<Long> sum_list =new ArrayList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
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
            sum_list.add(sum);
        }
        Collections.sort(sum_list, Collections.reverseOrder());
        return k<=sum_list.size()?sum_list.get(k-1):-1;
    }
}