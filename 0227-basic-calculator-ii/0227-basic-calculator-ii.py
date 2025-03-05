class Solution(object):
    def calculate(self, s):
        s = s.replace(" ", "")
        stack=[]
        num=0
        operations=('+', '-', '*', '/')
        temp='+'
        for i in range(len(s)):
            if s[i].isdigit():
                num = num * 10 + int(s[i]) 
            if s[i] in operations or i==len(s)-1:
                if temp=='+':
                    stack.append(num)
                elif temp=='-':
                    stack.append(-num)
                elif temp=='*':
                    stack.append(stack.pop()*num)
                elif temp=='/':
                    prev = stack.pop()
                    stack.append(prev // num if prev >= 0 else -(-prev // num))
                else:
                    stack.append(num)
                num=0
                temp=s[i]
        return sum(stack)