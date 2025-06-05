class Solution(object):
    def sumZero(self, n):
        temparr=[]
        if(n%2==0):
            for i in range(1,n//2+1):
                temparr.append(i)
                temparr.append(i*-1)
        else:
            for i in range(1,n//2+1):
                temparr.append(i)
                temparr.append(i*-1)
            temparr.append(0)
        return temparr
        