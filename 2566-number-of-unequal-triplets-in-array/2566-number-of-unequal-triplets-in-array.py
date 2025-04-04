class Solution(object):
    def unequalTriplets(self, nums):
        if len(set(nums))==1:
            return 0
        count=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i]!=nums[j] and nums[i]!=nums[k] and nums[j]!=nums[k]:
                        count+=1
        return count