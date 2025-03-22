class Solution(object):
    def removeOuterParentheses(self, s):
        stack=[]
        count=0
        for i in range(len(s)):
            if s[i]=='(':
                if count>0:
                    stack.append(s[i])
                count+=1
            else:
                count-=1
                if count>0:
                    stack.append(s[i])
        return "".join(stack)
            
        