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
        for i in range(len(nums)):
            if i%2!=0:
                fin.append(negative.pop(0))
            else:
                fin.append(positive.pop(0))
        return fin