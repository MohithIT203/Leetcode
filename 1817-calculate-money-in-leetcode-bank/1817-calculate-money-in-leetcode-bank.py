class Solution(object):
    def totalMoney(self, n):
        total=0
        start=1
        for i in range(1,n+1):
            total+=start+(i-1)%7
            if(i%7==0):
                start+=1
        return total


        