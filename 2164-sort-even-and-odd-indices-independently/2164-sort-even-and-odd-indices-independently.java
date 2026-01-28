class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        Integer even[] = new Integer[(n+1)/2];
        Integer odd[] = new Integer[n/2];

        for(int i=0;i<n;i++){
            if(i%2==0){
                even[i/2]=nums[i];
            }
            else{
                odd[i/2]=nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd,Collections.reverseOrder());
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                res[i]=even[i/2];
            }else{
                res[i]=odd[i/2];
            }
        }
        return res;
    }
}