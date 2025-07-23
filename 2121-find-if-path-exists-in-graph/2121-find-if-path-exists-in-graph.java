class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean seen[]=new boolean[n+1];
	    Queue<Integer> q=new LinkedList<>();
	    q.add(source);
	    seen[source]=true;
	    while(!q.isEmpty()){
	        int v=q.remove();
                if(v==destination){
                    return true;
                }
	        for(int a:graph.get(v)){
	            if(!seen[a]){
	                q.add(a);
	                seen[a]=true;
	            }
	        }
	    }
        return false;
    }
}