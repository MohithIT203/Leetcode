# class Solution(object):
#     def minIncrementForUnique(self, nums):
#         def check(arr,num):
#             if arr.count(num)>1:
#                 return True
#         count=0
#         for i in range(len(nums)):
#             while(check(nums,nums[i])):
#                 nums[i]+=1
#                 count+=1
#         return count
class Solution(object):
    def minIncrementForUnique(self, nums):
        nums.sort()
        print(nums)
        count = 0
        for i in range(1, len(nums)):
            if nums[i] <= nums[i-1]:
                increment = nums[i-1] - nums[i] + 1
                nums[i] += increment
                count += increment
        return count
 