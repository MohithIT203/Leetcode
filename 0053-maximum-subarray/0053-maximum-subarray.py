class Solution(object):
    def maxSubArray(self, nums):
        maxi=nums[0]
        max_so_far=nums[0]
        for i in range(1,len(nums)):
            max_so_far = max(nums[i], max_so_far + nums[i])
            maxi=max(max_so_far,maxi)
        return maxi