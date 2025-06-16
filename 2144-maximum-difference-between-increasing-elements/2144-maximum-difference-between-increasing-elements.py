class Solution(object):
    def maximumDifference(self, nums):
        difference = -1
        minimum = nums[0]

        for i in range(1, len(nums)):
            if nums[i] > minimum:
                difference = max(difference, nums[i] - minimum)
            else:
                minimum = nums[i]

        return difference
