class Solution(object):
    def climbStairs(self, n):
        #fibonacci logic but using dp
        if n==1:
            return 1
        if n==2:
            return 2
        num1=1
        num2=2
        
        for _ in range(3,n+1):
            num3=num1+num2
            num1=num2
            num2=num3
        return num3


        