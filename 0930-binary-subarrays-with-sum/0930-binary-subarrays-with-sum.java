class Solution {
    int helper(int[] nums,int k){
        int left=0,max_len=0,sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>k){
                sum-=nums[left];
                left++;
            }
            max_len +=right-left+1;
        }
        return max_len;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count1=helper(nums,goal);
        if(goal==0) return count1;
        int count2=helper(nums,goal-1);
        return count1-count2;
        //goal = 5
        //c1 = {1,2,3,4,5}
        //c2 = {1,2,3,4}
        //c1-c2 = goal(5)
    }
}