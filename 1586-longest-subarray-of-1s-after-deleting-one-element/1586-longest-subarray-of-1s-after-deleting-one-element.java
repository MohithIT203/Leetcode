class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0,l=0,r=0,maxl=0;
        while(l<nums.length && r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            if(zero>1){
                while(zero>1){
                    if(nums[l]==0){
                        zero--;
                    }
                    l++;
                }
                
            }
            maxl=Math.max(maxl,(r-l));
            r++;
        }
        return maxl;
    }
}