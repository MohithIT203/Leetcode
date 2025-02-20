class Solution(object):
    def sortArrayByParityII(self, nums):
        odd=[]
        even=[]
        arr=[]
        for i in range(len(nums)):
            if nums[i]%2==0:
                even.append(nums[i])
            else:
                odd.append(nums[i])
        for i in range(len(nums)):
            if i%2==0:
                arr.append(even.pop(0))
            else:
                arr.append(odd.pop(0))
        return arr
        