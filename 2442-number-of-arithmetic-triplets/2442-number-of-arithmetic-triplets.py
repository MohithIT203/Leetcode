class Solution(object):
    def arithmeticTriplets(self, nums, diff):
        # count=0
        # for i in range(len(nums)):
        #     for j in range(i+1,len(nums)):
        #         for k in range(j+1,len(nums)):
        #             if nums[j]-nums[i]==diff and nums[k]-nums[j]==diff:
        #                 count+=1
        # return count

#         b=a+diff
# \U0001d450=\U0001d44f+diff=\U0001d44e+2×diff
# c=b+diff=a+2×diff
        count=0
        unique=set(nums)
        for i in range(len(nums)):
            if nums[i]+diff in unique:
                if nums[i]+2*diff in unique:
                    count+=1
        return count