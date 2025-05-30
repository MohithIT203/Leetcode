class Solution(object):
    def singleNonDuplicate(self, nums):
        temp=nums[len(nums)-1]
        for i in range(0,len(nums)-1,2):
            if nums[i]!=nums[i+1]:
                return nums[i]
        return temp
        