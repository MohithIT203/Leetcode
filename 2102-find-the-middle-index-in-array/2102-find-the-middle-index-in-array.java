class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      }
      int leftsum=0;
      for(int i=0;i<nums.length;i++){
        sum-=nums[i];
        if(leftsum==sum){
          return i;
        }
        leftsum+=nums[i];
      }
      return -1;
    }
}