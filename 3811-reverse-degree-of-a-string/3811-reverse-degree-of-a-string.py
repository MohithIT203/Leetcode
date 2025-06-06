class Solution(object):
    def reverseDegree(self, s):
        total=0
        for i in range(len(s)):
            total+=(123-ord(s[i]))*(i+1)
        return total