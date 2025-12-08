class Opath {
    int row, col, step;

    Opath() {
        row = col = step = 0;
    }

    Opath(int grow, int gcol, int gstep) {
        row = grow;
        col = gcol;
        step = gstep;
    }
}

class Solution {
    int shortestpath(int[][] grid) {
        int total_size = grid.length;
         if(total_size==1) return 1;

        int[][] dir = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 },
                { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
        Queue<Opath> que = new LinkedList<>();
        boolean[][] visited = new boolean[total_size][total_size];
        que.offer(new Opath(0, 0, 1));
        while (!que.isEmpty()) {
            Opath data = que.poll();
            int work_row = data.row;
            int work_col = data.col;
            int step = data.step;
            for (int i = 0; i < dir.length; i++) {
                int cal_row =  work_row + dir[i][0];
                int cal_col = work_col + dir[i][1];
                

                if (cal_row >= 0 && cal_row < total_size
                        && cal_col >= 0 && cal_col < total_size && !visited[cal_row][cal_col]
                        && grid[cal_row][cal_col] == 0) {
                    visited[cal_row][cal_col] = true;
                    que.offer(new Opath(cal_row, cal_col, step + 1));
                    //destination
                    if (cal_row == total_size - 1 && cal_col == total_size - 1) {
                        return step + 1;
                    }
                }
            }
        }
        return -1;

    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        //Using bfs approach
        if (grid[0][0] == 1)
            return -1;
        return shortestpath(grid);
    }
}