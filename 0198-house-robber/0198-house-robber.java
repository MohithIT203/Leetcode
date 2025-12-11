class Solution {
    //Bottom-up approach
    int rec_BU(int[] nums, int w_ind) {
        if (w_ind >= nums.length) {
            return 0;
        }
        int exclude = rec_BU(nums, w_ind + 1);
        int include = nums[w_ind] + rec_BU(nums, w_ind + 2); // to skip adjacent
        return Math.max(exclude, include);

    }

    //memoization
    int rec_BU_memo(int[] nums, int w_ind, int[] memo) {
        if (w_ind >= nums.length) {
            return 0;
        }
        if (memo[w_ind] != -1)
            return memo[w_ind];
        int exclude = rec_BU_memo(nums, w_ind + 1, memo);
        int include = nums[w_ind] + rec_BU_memo(nums, w_ind + 2, memo); // to skip adjacent
        memo[w_ind] = Math.max(exclude, include);
        return memo[w_ind];

    }

    int rob_wrapper(int[] nums) {
        // int res = rec_BU(nums, 0);
        // return res;
        // int[] memo = new int[nums.length];
        // Arrays.fill(memo, -1);
        // return rec_BU_memo(nums,0,memo);

        //tabulation
        int[] tab = new int[nums.length + 2];
        int wind;
        tab[nums.length] = tab[nums.length + 1] = 0;// not necessary
        for (wind = nums.length - 1; wind >= 0; wind--)//top down
        {
            int exc_sum = tab[wind + 1];//exc
            int inc_sum = nums[wind] + tab[wind + 2];//inc
            tab[wind] = Math.max(exc_sum, inc_sum);
        }
        return tab[0];

    }

    public int rob(int[] nums) {
        return rob_wrapper(nums);
    }
}