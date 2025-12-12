class Solution {
    int min_path(List<List<Integer>> triangle, int w_row, int w_col) {
        if (w_row == triangle.size() || w_col == triangle.get(w_row).size()) {
            return 0;
        }
        int d_path_sum = min_path(triangle, w_row + 1, w_col);
        int rd_path_sum = min_path(triangle, w_row + 1, w_col + 1);
        return Math.min(d_path_sum, rd_path_sum) + triangle.get(w_row).get(w_col);
    }

    //dp-memoization
    int min_path_memo(List<List<Integer>> triangle, int w_row, int w_col, int[][] memo) {
        if (w_row == triangle.size() || w_col == triangle.get(w_row).size()) {
            return 0;
        }
        if (memo[w_row][w_col] != Integer.MIN_VALUE) {
            return memo[w_row][w_col];
        }
        int d_path_sum = min_path_memo(triangle, w_row + 1, w_col, memo);
        int rd_path_sum = min_path_memo(triangle, w_row + 1, w_col + 1, memo);

        return memo[w_row][w_col] = Math.min(d_path_sum, rd_path_sum) + triangle.get(w_row).get(w_col);
    }

    //wrapper
    int tot_wrapper(List<List<Integer>> triangle) {
        int[][] memo = new int[triangle.size()][];
        for (int row = 0; row < triangle.size(); row++) {
            memo[row] = new int[triangle.get(row).size()];
            Arrays.fill(memo[row], Integer.MIN_VALUE); // not -1 due to constraints
        }
        // return min_path(triangle,0,0);

        //dp-tabulation
        int[][] tab = new int[triangle.size() + 1][];

        int row, col;
        for (row = 0; row <= triangle.size(); row++)

            tab[row] = new int[row + 2];
        // if(work_row==tri.size() ||  work_col==tri.get(work_row).size() ) return 0; 
        //optional
        for (col = 0; col < tab[triangle.size()].length; col++)
            tab[triangle.size()][col] = 0;
        for (row = 0; row < triangle.size(); row++)
            tab[row][row] = 0;
        int work_row, work_col;
        for (work_row = triangle.size() - 1; work_row >= 0; work_row--) {
            for (work_col = triangle.get(work_row).size() - 1; work_col >= 0; work_col--) {
                int d_path_sum = tab[work_row + 1][work_col];//down 
                int rd_path_sum = tab[work_row + 1][work_col + 1];//right down 
                tab[work_row][work_col] = triangle.get(work_row).get(work_col) + Math.min(d_path_sum, rd_path_sum);
            }
        }
        // return tab[0][0];
        return min_path_memo(triangle, 0, 0, memo); //final return memoization
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        return tot_wrapper(triangle);
    }
}