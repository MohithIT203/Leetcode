class Solution {
    public int minOperations(int[] nums, int x) {
        //take the remaining part instead of removed part
        int tot = 0;
        for(int num:nums){
            tot+=num;
        }
        int target = tot-x; //remaining part
        if (target < 0) return -1;
        if (target == 0) return nums.length;

        int left = 0,maxlen = -1,sum = 0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>target){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        return maxlen == -1 ? -1 : nums.length - maxlen;
    }
}