class Solution(object):
    def largestNumber(self, nums):
        nums = map(str, nums)
        nums.sort(cmp=lambda a, b: cmp(b + a, a + b))
        result = ''.join(nums)
        if result[0] == '0':
            return '0' 
        else:
            return result