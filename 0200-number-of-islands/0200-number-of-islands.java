class Solution {
    boolean[][] visited;
    int helper(char[][] grid,int work_row,int work_col){
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{work_row,work_col});
        visited[work_row][work_col]=true;

        while(!que.isEmpty()){
            int[] index = que.poll();

            for(int i=0;i<dir.length;i++){
                int cal_row=index[0]+dir[i][0];
                int cal_col=index[1]+dir[i][1];
                if(cal_row>=0 && cal_row<grid.length 
            && cal_col>=0 && cal_col<grid[0].length && visited[cal_row][cal_col]==false && grid[cal_row][cal_col]=='1')
                {
                    que.offer(new int[]{cal_row,cal_col});
                    visited[cal_row][cal_col]=true;
                }
            }
        }
        return 1;
    }
    public int numIslands(char[][] grid) { 
        int rows = grid.length;
        int cols = grid[0].length;
        visited = new boolean[rows][cols];

        int count = 0;

        //start from '1'
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == '1' && !visited[r][c]){
                    count += helper(grid, r, c);
                }
            }
        }

        return count;
    }
}