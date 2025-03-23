class Solution(object):
    def numberGame(self, nums):
        nums.sort()
        final=[]
        count=0
        for i in range(len(nums)):
            count+=1
            if count==2:
                final.append(nums[i])
                final.append(nums[i-1])
                count=0
        return final