class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int indx = 0;
        for(int i=0;i<n;i++){
            int ind = ((i + nums[i]) % n + n) % n; //extra n for -ve ind fix
            res[i]=nums[ind];
        }
        return res;
    }
}