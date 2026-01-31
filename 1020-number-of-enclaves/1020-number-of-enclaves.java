class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        //bfs traversal
        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];

        //boundary elements
        //row
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                queue.offer(new Pair(0,i));
                vis[0][i]=1;
            }
            if(grid[n-1][i]==1){
                queue.offer(new Pair(n-1,i));
                vis[n-1][i]=1;
            }
        }
        //column
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                queue.offer(new Pair(i,0));
                vis[i][0]=1;
            }
            if(grid[i][m-1]==1){
                queue.offer(new Pair(i,m-1));
                vis[i][m-1]=1;
            }
        }
        //bfs traversal
        int[] drow = { -1, 0, 1, 0 }; //directions
        int[] dcol = { 0, 1, 0, -1 };

        //core logic
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int row = queue.peek().row; //row
                int col = queue.peek().col; //col 
                queue.poll();
                //check in all 4 directions
                for (int j = 0; j < 4; j++) {
                    int new_row = row + drow[j];
                    int new_col = col + dcol[j];
                    //boundary check
                    if (new_row >= 0 && new_row <= n - 1 && new_col >= 0 &&
                            new_col <= m - 1 && 
                            vis[new_row][new_col] == 0 &&
                            grid[new_row][new_col] == 1) {
                        vis[new_row][new_col] = 1;
                        queue.offer(new Pair(new_row, new_col));
                    }
                }
            }
        }
        int enclaves = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    enclaves++;
                }
            }
        }
        return enclaves;
    }
}