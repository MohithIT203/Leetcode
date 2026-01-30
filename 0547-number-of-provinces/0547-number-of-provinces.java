class Solution {
    //dfs
    public void dfs(int src, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[src] = 1;
        for (int num : adj.get(src)) {  //all adjacent elements
            if (vis[num] == 0) {
                dfs(num,adj,vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;

        //Initialize empty list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int vis[] = new int[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, adj, vis);
                provinces++;
            }
        }
        return provinces;
    }
}