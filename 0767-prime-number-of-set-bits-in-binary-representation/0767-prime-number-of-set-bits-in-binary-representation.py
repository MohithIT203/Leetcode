class Solution(object):
    def countPrimeSetBits(self, left, right):
        count=0
        arr=[2,3,5,7,11,13,17,19]
        for i in range(left,right+1):
            temp=bin(i).count('1')
            if temp in arr:
                count+=1
        return count
        