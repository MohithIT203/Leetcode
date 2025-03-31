class Solution(object):
    def heightChecker(self, heights):
        temp=sorted(heights)
        count=0
        for i in range(len(heights)):
            if temp[i]!=heights[i]:
                count+=1
        return count
        