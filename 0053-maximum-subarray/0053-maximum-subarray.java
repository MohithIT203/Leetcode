class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxi=Integer.MIN_VALUE;
        // int startInd=-1,endInd=-1,tempStart=-1;

        //Kadane's algorithm
        //with printing
        for(int i=0;i<nums.length;i++){
            // if(sum==0){
            //     tempStart=i;
            // }
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                // startInd=tempStart;
                // endInd=i;
            }
            if(sum<0){
                sum=0;
            }
        }

        // for(int i=startInd;i<=endInd;i++){
        //      System.out.print(nums[i]+" ");
        // }
        return maxi;
    }
}