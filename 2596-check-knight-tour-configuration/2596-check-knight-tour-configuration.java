class Solution {
    //recursion
    boolean fun_v1(int[][] grid, int work_row, int work_col) {
        if (grid[work_row][work_col] == grid.length * grid.length - 1) {
            return true;
        }
        int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 },
                { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };
        for (int i = 0; i < dir.length; i++) {
            int cal_row = work_row + dir[i][0];
            int cal_col = work_col + dir[i][1];
            if (cal_row >= 0 && cal_row < grid.length && cal_col >= 0 && cal_col < grid[0].length
                    && grid[work_row][work_col] + 1 == grid[cal_row][cal_col]) {
                boolean res = fun_v1(grid, cal_row, cal_col);
                return res;
            }
        }
        return false;
    }

    //normal loop
    boolean fun_v2(int[][] grid,int work_row,int work_col){
        int [][] dir={{-2,1},{-1,2},{1,2},{2,1},
        {2,-1},{1,-2},{-1,-2},{-2,-1}};

        while(true){
             if(grid[work_row][work_col]==grid.length*grid.length-1){
            return true;
        }
            boolean flag = false;
        for(int i=0;i<dir.length;i++){
            int cal_row=work_row+dir[i][0];
            int cal_col=work_col+dir[i][1]; 
            if(cal_row>=0 && cal_row<grid.length && cal_col>=0 && cal_col<grid[0].length && grid[work_row][work_col]+1==grid[cal_row][cal_col]) {                
                work_row=cal_row;
                work_col=cal_col;
                flag=true;
                break;
            }
        }
            if(!flag) return false;
    }
  
}

    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0)return false;
        return fun_v1(grid, 0, 0);
    }
}