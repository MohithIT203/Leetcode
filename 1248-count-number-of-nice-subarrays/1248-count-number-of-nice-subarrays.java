class Solution {
    int helper(int[] nums,int k){
        int left=0,odd_count=0,count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                odd_count++;
            }
            while(odd_count>k){
                if(nums[left]%2==1){
                    odd_count--;
                }
                    left++;
            }
            count +=right-left+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int count1 = helper(nums,k);
        if(k==0) return count1;
        int count2 = helper(nums,k-1);
        return count1-count2;
    }
}