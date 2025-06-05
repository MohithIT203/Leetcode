class Solution(object):
    def findNumbers(self, nums):
        count=0
        for i in range(len(nums)):
            temp=str(nums[i])
            if len(temp)%2==0:
                count+=1
        return count
            
        