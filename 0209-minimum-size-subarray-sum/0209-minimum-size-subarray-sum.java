class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, len = Integer.MAX_VALUE, sum = 0;
        while (r < nums.length) {
            sum+=nums[r];
            while(sum>=target){
                len=Math.min(len,(r-l+1));
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}