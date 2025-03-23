class Solution(object):
    def minOperations(self, nums, k):
        minimum=0
        for num in nums:
            if num<k:
                minimum+=1
        return minimum
        