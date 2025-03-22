class Solution(object):
    def countPairs(self, nums, target):
        count=0
        nums.sort()
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if(nums[i]+nums[j]<target and i!=j):
                    count+=1
        return count

        