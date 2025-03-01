class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        visit=set()
        index=0
        for i in range(len(nums)):
            if nums[i] not in visit:
                visit.add(nums[i])
                nums[index]=nums[i]
                index+=1
        return index