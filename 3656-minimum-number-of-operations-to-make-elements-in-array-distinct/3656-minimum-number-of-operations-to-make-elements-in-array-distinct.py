class Solution(object):
    def minimumOperations(self, nums):
        def check(arr,num):
            temp=arr[num::]
            for i in range(len(temp)):
                if temp.count(temp[i])>1:
                    return True
            return False
        count=0
        for i in range(0,len(nums),3):
            if check(nums,i):
                count+=1
        return count
        