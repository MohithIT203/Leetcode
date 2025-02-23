class Solution(object):
    def calPoints(self, operations):
        stack=[]
        for i in range(len(operations)):
            if operations[i]=='C':
                stack.pop()
            elif operations[i]=='D':
                stack.append(2*stack[-1])
            elif operations[i]=='+':
                stack.append(stack[len(stack)-1]+stack[len(stack)-2])
            else:
                stack.append(int(operations[i]))
        total=0
        for i in stack:
            total+=i
        return total