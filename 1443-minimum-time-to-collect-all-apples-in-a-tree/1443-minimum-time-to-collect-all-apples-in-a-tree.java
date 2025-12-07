class Solution {
   int fun(HashMap<Integer,List<Integer>> map ,int work_vert,boolean [] vis,List<Boolean> hasApple)
    {
        List<Integer> conn_al=map.get(work_vert);
        int ind;
        vis[work_vert]=true;
        //System.out.print(work_vert+" ");
        int contribut_from_conn_vert=0;
        for(ind=0;ind<conn_al.size();ind++)
        {
            int conn_vert=conn_al.get(ind);
            if(vis[conn_vert]==false)
            {        
                contribut_from_conn_vert=contribut_from_conn_vert+fun(map,conn_vert,vis,hasApple);
            }
        }
        int contribut_from_work_vert=0;
        if(hasApple.get(work_vert)==true||contribut_from_conn_vert>0)
            if(work_vert!=0)
                contribut_from_work_vert=2;
        return contribut_from_work_vert+contribut_from_conn_vert;
    }

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer,List<Integer>> adjacencyList = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int vert1 = edges[i][0];
            int vert2 = edges[i][1];
            if(!adjacencyList.containsKey(vert1)){
                adjacencyList.put(vert1,new ArrayList<>());
            }
            adjacencyList.get(vert1).add(vert2);
            if(!adjacencyList.containsKey(vert2)){
                adjacencyList.put(vert2,new ArrayList<>());
            }
            adjacencyList.get(vert2).add(vert1);
        }
        for(int i=0;i<n;i++){
             if(!adjacencyList.containsKey(i)){
                adjacencyList.put(i,new ArrayList<>());
            }
        }
        boolean [] vis= new boolean[n];
        return fun(adjacencyList,0,vis,hasApple);
    }
}