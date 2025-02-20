class Solution(object):
    def countAsterisks(self, s):
        stack=[]
        count=0
        for i in range(len(s)):
            if not stack and s[i]=='*':
                count+=1
            elif not stack and s[i]=='|':
                stack.append('|')
            elif stack and s[i]=='|':
                stack.pop()
        return count