class Solution(object):
    def findGCD(self, nums):
        maximum=max(nums)
        minimum=min(nums)
        for i in range(minimum,0,-1):
            print(i)
            if maximum%i==0 and minimum%i==0:
                return i
        return 1
        