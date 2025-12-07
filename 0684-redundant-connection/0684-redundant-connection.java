class Solution {
    int find_parent(int[] parent, int vert)
    {
        return parent[vert];
    }
    void union(int vert1,int vert2,int[] parent){
        int max=Math.max(vert1,vert2);
        int min=Math.min(vert1,vert2);

        for(int i=0;i<parent.length;i++){
            if(parent[i]==max){
                parent[i]=min;
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        //Using kruskal algo
        int[] parent = new int[edges.length+1];
        int[] loop = new int[2];
        for(int i=1;i<=edges.length;i++){
            parent[i]=i;
        }
        for(int i=0;i<edges.length;i++){
            int n1 = edges[i][0];
            int n2 = edges[i][1];
            int par1 = find_parent(parent,n1);
            int par2 = find_parent(parent,n2);
            if(par1!=par2){
                union(par1,par2,parent);
            }
            else{
                loop[0]=n1;
                loop[1]=n2;
            }
        }
        
        return loop;
    }
}