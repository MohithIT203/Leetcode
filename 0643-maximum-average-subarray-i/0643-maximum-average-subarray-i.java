class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,temp=0;
        double t=0,max=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int i=k;
        t=(double)sum/k;
        max=t;
        while(i<nums.length){ 
                sum=sum-nums[temp++]+nums[i++];
                t=(double)sum/k;
                max=Math.max(max,t);
              
        }
        return max;
    }
}