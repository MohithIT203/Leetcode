class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length*2;
        int[] fin=new int[n];
        for(int i=0;i<n;i++){
            fin[i]=nums[i%nums.length];
        }
        return fin;
    }
}