class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums.length==1 && k%2!=0) return -1;
        int min = Math.min(k - 1 ,nums.length);
        int max=Integer.MIN_VALUE;

        //remove k-1 and add 1 element
        for(int i=0;i<min;i++){
            max=Math.max(max,nums[i]);
        }

        //remove k element,no addition
        if (k < nums.length) {
            max = Math.max(max, nums[k]);
        }
        return max;
    }
}