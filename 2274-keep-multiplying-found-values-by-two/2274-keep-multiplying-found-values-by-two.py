class Solution(object):
    def findFinalValue(self, nums, original):
        nums.sort()
        for i in range(len(nums)):
            if original==nums[i]:
                nums[i]*=2
                original=nums[i]
        return original
        