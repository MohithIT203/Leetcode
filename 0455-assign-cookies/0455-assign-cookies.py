class Solution(object):
    def findContentChildren(self, g, s):
        g.sort()
        s.sort()
        start1=0
        start2=0
        count=0
        while(start1<len(g) and start2<len(s)):
            if(g[start1]<=s[start2]):
                start1+=1
                start2+=1
                count+=1
            else:
                start2+=1
        return count

        