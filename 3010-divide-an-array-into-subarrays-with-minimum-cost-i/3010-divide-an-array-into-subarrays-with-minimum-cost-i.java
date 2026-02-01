class Solution {
    public int minimumCost(int[] nums) {
        //1st element is guaranteed since contiguous segments
        for(int i=1;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums[0]+nums[1]+nums[2];
    }
}