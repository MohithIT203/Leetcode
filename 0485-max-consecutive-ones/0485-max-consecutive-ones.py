class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        start=0
        end=len(nums)
        count=0
        maxi=count
        while(start<end):
            if(nums[start]==1):
                count+=1
                start+=1
            else:
                maxi=max(count,maxi)
                count=0
                start+=1
        maxi=max(count,maxi)
        return maxi
        