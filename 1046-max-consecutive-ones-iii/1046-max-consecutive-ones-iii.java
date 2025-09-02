class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0,l=0,r=0,maxl=0;
        while(l<nums.length && r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            if(zero>k){
                while(zero>k){
                    if(nums[l]==0){
                        zero--;
                    }
                    l++;
                }
                
            }
            maxl=Math.max(maxl,(r-l+1));
            r++;
        }
        return maxl;
    }
}