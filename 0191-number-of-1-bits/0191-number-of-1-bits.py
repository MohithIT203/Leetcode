class Solution(object):
    def hammingWeight(self, n):
        return bin(n).count('1')
        # count=0
        # while n:
        #     temp=n%2
        #     if temp==1:
        #         count+=1
        #     n//=2
        # return count