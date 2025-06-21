class Solution {
    public int[] productExceptSelf(int[] nums) {
        //using prefix sum
        int []fin=new int[nums.length];
        int temp1=1,temp2=1;
        for(int i=0;i<nums.length;i++){
            fin[i]=temp1;
            temp1*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            fin[i]*=temp2;
            temp2*=nums[i];
        }

        return fin;
    }
    
}