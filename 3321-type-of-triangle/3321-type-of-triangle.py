class Solution(object):
    def triangleType(self, nums):
        nums.sort()
        if nums[0] + nums[1] > nums[2]:
            unique_sides = len(set(nums))
            if unique_sides == 1:
                return "equilateral"
            elif unique_sides == 2:
                return "isosceles"
            else:
                return "scalene"
        return "none"
