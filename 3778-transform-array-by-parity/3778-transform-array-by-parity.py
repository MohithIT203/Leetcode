class Solution(object):
    def transformArray(self, nums):
        even=0
        for num in nums:
            if num%2==0:
                even+=1
        for i in range(len(nums)):
            if even!=0:
                nums[i]=0
                even-=1
            else:
                nums[i]=1
        return nums
        