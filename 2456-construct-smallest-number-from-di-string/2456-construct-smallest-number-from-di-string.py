class Solution(object):
    def smallestNumber(self, pattern):
        stack = []
        result = []
    
        for i in range(len(pattern) + 1):
            stack.append(str(i + 1))  # Push the next number
            if i == len(pattern) or pattern[i] == 'I':
                while stack:
                    result.append(stack.pop())  # Pop in decreasing order
    
        return "".join(result)
        