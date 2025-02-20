class Solution(object):
    def rearrangeArray(self, nums):
        negative=[]
        positive=[]
        fin=[]
        for num in nums:
            if num<0:
                negative.append(num)
            else:
                positive.append(num)
        for i in range(len(positive)):
            fin.append(positive[i])
            fin.append(negative[i])
        return fin