class Solution(object):
    def calPoints(self, operations):
        stack=[]
        product=1
        sum=0
        for i in range(len(operations)):
            product=1
            sum=0
            if operations[i]=='C':
                stack.pop()
            elif operations[i]=='D':
                product=2*stack[-1]
                stack.append(product)
            elif operations[i]=='+':
                sum=stack[len(stack)-1]+stack[len(stack)-2]
                stack.append(sum)
            else:
                stack.append(int(operations[i]))
        total=0
        for i in stack:
            total+=i
        return total