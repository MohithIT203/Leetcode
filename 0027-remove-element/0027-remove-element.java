class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0,end=0,k=0;

        while(start<nums.length){
            if(nums[start]!=val){
                nums[k++]=nums[start];
            }
               start++;
            
        }
        return k;
    }
    
}