class Solution {
    public long countSubarrays(int[] nums, long k) {
        long res=0,count=0;
        int left=0,indx=1;
        for(int right = 0; right< nums.length; right++){
            res+=nums[right];
            while((res*indx)>=k){
                res-=nums[left];
                indx--;
                left++;
            }
            count+=right-left+1;
            indx++;
        }
        return count;
    }
}