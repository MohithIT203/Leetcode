class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum_num1=0,sum_num2=0;
        for(int i=0;i<nums1.length;i++){
            sum_num1+=nums1[i];
            sum_num2+=nums2[i];
        }

        return (sum_num2-sum_num1)/nums1.length;
    }
}