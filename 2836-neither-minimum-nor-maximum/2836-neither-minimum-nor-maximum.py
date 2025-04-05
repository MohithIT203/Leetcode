class Solution(object):
    def findNonMinOrMax(self, nums):
        mini=min(nums)
        maxi=max(nums)
        for num in nums:
            if num!=mini and num!=maxi:
                return num
        return -1
        