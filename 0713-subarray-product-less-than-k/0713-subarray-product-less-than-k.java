class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Only positive numbers -sliding window
        if(k<=1) return 0;
        int product=1,count=0;
        int left=0,right;
        for(right=0;right<nums.length;right++){
            product*=nums[right];
            while(product>=k){ //divide untill product is less than k
                product/=nums[left];
                left++;
            }
            count+=(right-left+1);    
        }
        return count;
    }
}