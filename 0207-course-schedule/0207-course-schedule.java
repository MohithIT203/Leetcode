class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        //Adjancency List
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prereq){
            int ai = edge[0];
            int bi = edge[1];
            adj.get(bi).add(ai);
            indegree[ai]++;
        }
        //Topological sort
        Queue<Integer> que = new LinkedList<>();
        int[] vis = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                que.offer(i);
            }
        }
        //bfs traversal
        ArrayList<Integer> list = new ArrayList<>();
        //int count = 0;
        while(que.size()>0){
            int node = que.poll();
            list.add(node);
            //count++;
            for(int nodes:adj.get(node)){
                indegree[nodes]--;
                if(indegree[nodes]==0){
                    que.offer(nodes);
                }
            }
        }
        //return count;
        return list.size()==numCourses;
    }
}