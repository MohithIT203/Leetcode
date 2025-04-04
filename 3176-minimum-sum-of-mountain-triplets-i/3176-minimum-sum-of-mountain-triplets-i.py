class Solution(object):
    def minimumSum(self, nums):
        maxi=float('inf')
        temp=False
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i]+nums[j]+nums[k]<maxi and nums[i]<nums[j] and nums[k]<nums[j]:
                        maxi=nums[i]+nums[j]+nums[k]
                        temp=True
        if temp:
            return maxi
        return -1

        