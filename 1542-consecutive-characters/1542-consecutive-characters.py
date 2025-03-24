class Solution(object):
    def maxPower(self, s):
        start,end=0,0
        count=0
        maxi=count
        while(end<len(s)):
            if s[start]==s[end]:
                count+=1
                end+=1
            else:
                start=end
                maxi=max(count,maxi)
                count=0
        maxi=max(count,maxi)
        return maxi