class Solution(object):
    def findNumbers(self, nums):
        count=0
        total=0
        for i in range(len(nums)):
            count=0
            temp=nums[i]
            while(temp!=0):
                temp=temp//10
                count+=1
            if count%2==0:
                total+=1
        return total
            
        