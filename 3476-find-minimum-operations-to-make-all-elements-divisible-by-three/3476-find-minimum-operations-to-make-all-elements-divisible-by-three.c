int minimumOperations(int* nums, int numsSize) {
    int sum=0,count=0;
    for(int i=0;i<numsSize;i++)
    {
       if((nums[i]-1)%3==0)
            {
                count++;
            }
        else if((nums[i]+1)%3==0)
            {
                count++;
            }     
        
    }
    return count;
}