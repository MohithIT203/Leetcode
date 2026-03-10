class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int i = 0;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        double max = sum/k;
        for(int j=0;j<nums.length&&i<nums.length;j++){
            sum-=nums[j];
            sum+=nums[i++];
            max=Math.max(max,sum/k);
        }
    return max;
    }

}