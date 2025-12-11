class Solution {
    //dp memoization
    int cal_squares_memo(int n, int[] memo) {
        if (n == 0) {
            return 0;
        }
        int min_steps = Integer.MAX_VALUE;
        if (memo[n] != -1)
            return memo[n];
        for (int ind = 1; ind * ind <= n; ind++) {
            int steps = 1 + cal_squares_memo(n - (ind * ind), memo);
            min_steps = Math.min(min_steps, steps);
            memo[n] = min_steps;
        }
        return memo[n];
    }

    public int numSquares(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int fin = cal_squares_memo(n, memo);

        //dp tabulation
        int[] tab = new int[n + 1];
        int target;
        tab[0] = 0;
        for (target = 1; target <= n; target++) {
            int num;
            int min_steps = Integer.MAX_VALUE;
            int st = (int) Math.sqrt(target);
            for (num = st; num >= 1; num--) {
                int steps = 1 + tab[target - (num * num)];
                min_steps = Math.min(min_steps, steps);//picking min out availbale          
            }
            tab[target] = min_steps;
        }
        // System.out.println(tab[n]);
        return fin;
    }
}