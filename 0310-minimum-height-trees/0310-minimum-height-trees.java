class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);
        List<List<Integer>> adj = new ArrayList<>();
        int[] degree = new int[n];
        //Adjacency list
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int ai = edge[0];
            int bi = edge[1];
            adj.get(ai).add(bi);
            adj.get(bi).add(ai);
            degree[ai]++;
            degree[bi]++;

        }
        //Leaf Trimming Method
        //find the center - making root as the middle created a tree with 
        //minimum height
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) q.offer(i);
        }

        int remaining = n;
        while (remaining > 2) {
            int size = q.size();
            remaining -= size;

            for (int i = 0; i < size; i++) {
                int leaf = q.poll();
                for (int nei : adj.get(leaf)) {
                    degree[nei]--;
                    if (degree[nei] == 1) q.offer(nei);
                }
            }
        }

        return new ArrayList<>(q);
    }
}