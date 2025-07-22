class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=0,left=0,right=0,max=0;
        while(left<nums.length){
            if(!set.contains(nums[left])){
                sum+=nums[left];
                set.add(nums[left]);
                max=Math.max(max,sum);
                left++;
            }
            else{
                sum-=nums[right];
                set.remove(nums[right]);
                right++;
            }
        }
        return max;
    }
}