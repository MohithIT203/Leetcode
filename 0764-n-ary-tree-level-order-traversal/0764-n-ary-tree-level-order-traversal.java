/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> level=new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return level;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                list.add(current.val);
                if (current.children != null) {
                    for (Node child : current.children) {
                        queue.add(child);
                    }
                }
            }

            level.add(list);
        }
          return level;
    }
}