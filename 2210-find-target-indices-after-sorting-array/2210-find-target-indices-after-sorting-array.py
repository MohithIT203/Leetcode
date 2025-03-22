class Solution(object):
    def targetIndices(self, nums, target):
        arr=[]
        nums.sort()
        for i in range(len(nums)):
            if nums[i]==target:
                arr.append(i)
        return arr
        