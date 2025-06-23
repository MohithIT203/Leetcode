class Solution {
    public int singleNumber(int[] nums) {
        //applicable if duplicate occurs only twice
        int count=0;
       for(int n:nums){
        count=count^n;
       } 
       return count;
    }
}