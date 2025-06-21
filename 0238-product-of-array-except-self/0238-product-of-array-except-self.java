class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []prefix=new int[nums.length];
        int []suffix=new int[nums.length];
        int temp1=1,temp2=1;
        for(int i=0;i<nums.length;i++){
            // int t=nums[i];
            prefix[i]=temp1;
            temp1*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            // int t=nums[i];
            suffix[i]=temp2;
            temp2*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i]*suffix[i];
        }
        return nums;

    }
    
}