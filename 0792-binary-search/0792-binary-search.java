class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int pos=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                pos=mid;
                break;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return pos;
    }
}