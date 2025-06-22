class Solution {
    public int[] leftRightDifference(int[] nums) {
       int n=nums.length; 
       int []left=new int[n];
       int temp=0;
       for(int i=0;i<n;i++){
            left[i]=temp;
            temp+=nums[i];
       }
       temp=0;
       for(int i=n-1;i>=0;i--){
        left[i]=Math.abs(left[i]-temp);
        temp+=nums[i];
       }
       return left;
    }
}