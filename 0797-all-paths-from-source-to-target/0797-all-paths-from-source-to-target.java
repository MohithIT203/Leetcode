class Solution {
    void fun(int[][] graph , List<List<Integer>> path,int w_ind,List<Integer> arr){
        if(w_ind==graph.length-1){
            path.add(new ArrayList<>(arr));
            return;
        }

        for(int ind=0;ind<graph[w_ind].length;ind++){
            int next = graph[w_ind][ind];
            arr.add(next);
            fun(graph,path,next,arr);//backtracking
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> path = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        fun(graph,path,0,arr);
        return path;
    }
}