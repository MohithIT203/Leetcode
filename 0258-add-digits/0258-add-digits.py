class Solution(object):
    def addDigits(self, num):
        if(num==0):
            return 0
        return 1+(num-1)%9
        