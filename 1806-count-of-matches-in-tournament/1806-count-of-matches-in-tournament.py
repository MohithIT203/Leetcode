class Solution(object):
    def numberOfMatches(self, n):
        ans=0
        if(n%2==0):
            while(n>1):
                ans+=n-(n//2)
                n=n//2
        else:
            while(n>1):
                ans+=((n-1)//2)+1
                n=n-(((n-1)//2)+1)
        return ans
        