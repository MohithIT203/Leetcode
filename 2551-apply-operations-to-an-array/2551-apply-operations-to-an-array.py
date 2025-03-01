class Solution(object):
    def applyOperations(self, nums):
        finalList=[]
        nonzero_index =0
        for i in range(len(nums)-1):
            if nums[i]==nums[i+1]:
                nums[i]=nums[i]*2
                nums[i+1]=0
            else:
                continue
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[nonzero_index], nums[i] = nums[i], nums[nonzero_index]
                nonzero_index += 1
        return nums