class Solution(object):
    def maxPower(self, s):
        start,end=0,0
        count=0
        maxi=count
        while(end<len(s)):
            if s[start]==s[end]:
                end+=1
            else:
                start=end
            count=end-start
            maxi=max(count,maxi)
        return maxi