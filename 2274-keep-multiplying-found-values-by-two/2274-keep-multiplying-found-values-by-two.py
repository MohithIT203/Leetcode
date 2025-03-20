class Solution(object):
    def findFinalValue(self, nums, original):
        while True:
            if original in nums:
                original*=2
            else:
                break
        return original
        