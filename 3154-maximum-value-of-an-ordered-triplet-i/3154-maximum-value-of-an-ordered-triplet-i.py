class Solution(object):
    def maximumTripletValue(self, nums):
        maxi=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                total=0
                for k in range(j+1,len(nums)):
                    total=(nums[i]-nums[j])*nums[k]
                    maxi=max(total,maxi)
        return maxi
        