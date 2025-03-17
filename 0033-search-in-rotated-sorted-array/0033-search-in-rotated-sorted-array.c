int search(int* nums, int numsSize, int target) {
    int found=-1;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            return i;
        }
    }
    return found;
}