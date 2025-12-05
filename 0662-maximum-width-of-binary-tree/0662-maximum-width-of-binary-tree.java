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
class Tree{ //to store node and its level
    TreeNode node;
    int level;
    int position;
    Tree(TreeNode newNode,int lev,int pos){
        node=newNode;
        level=lev;
        position = pos;
    }
}
class Solution {
    int width(TreeNode root){ //
        Queue<Tree> qu =new LinkedList<>();
        qu.offer(new Tree(root,1,1));
        int prev_level=1;
        List<List<Integer>> res= new ArrayList<List<Integer>>(); 
        List<Integer> li =new ArrayList<>();
        while(!qu.isEmpty()){
            Tree temp = qu.poll();
            int size = qu.size();
            int curr_level = temp.level;
            // System.out.println(curr_level);
            int pos = temp.position;
            if(curr_level!=prev_level){
                System.out.println(li);
                res.add(new ArrayList<>(li));
                li.clear();
            }
            li.add(pos);
                if(temp.node.left!=null){
                    qu.offer(new Tree(temp.node.left,temp.level+1,temp.position*2-1));
                }
                if(temp.node.right!=null){
                    qu.offer(new Tree(temp.node.right,temp.level+1,temp.position*2));
                }
                prev_level=curr_level;
            res.add(new ArrayList<>(li));
            //  System.out.println(res);   
        } 
        int max_width=0;
        for(int i=0;i<res.size();i++){
            int start = res.get(i).get(0); //first element
            int end=res.get(i).get(res.get(i).size()-1); //last element
            max_width=Math.max(max_width,end-start+1);
        }
        return max_width;
    }
    public int widthOfBinaryTree(TreeNode root) {
        return width(root);
    }
}