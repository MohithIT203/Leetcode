class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        //bfs traversal
        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j));
                    vis[i][j]=1;
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        //bfs traversal
        int[] drow = { -1, 0, 1, 0 }; //directions
        int[] dcol = { 0, 1, 0, -1 };
        int temp = 0; //level
        //core logic
        while (queue.size() > 0) {
            temp++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int row = queue.peek().row; //row of rotten orange
                int col = queue.peek().col; //col of rotten orange
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
                        fresh--;
                    }
                }
            }

        }
        return (fresh==0)?temp-1:-1;

    }
}