class Solution(object):
    def minimumAverage(self, nums):
        start=0
        nums.sort()
        end=len(nums)-1
        fin=[]
        while(start<=end):
            avg=(nums[start]+nums[end])/2.0
            fin.append(avg)
            start+=1
            end-=1
        return min(fin)
        