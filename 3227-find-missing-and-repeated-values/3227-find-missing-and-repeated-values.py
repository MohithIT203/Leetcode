class Solution(object):
    def findMissingAndRepeatedValues(self, grid):
        length=len(grid)*len(grid)
        stack=[x for x in range(1,len(grid)*len(grid)+1)]
        arr=[]
        repeatstack=[]
        fin=[]
        for i,num in enumerate(grid):
            arr.extend(num)
        for i in range(len(arr)):
            if arr[i] in repeatstack:
                fin.append(arr[i])
            repeatstack.append(arr[i])
        for nums in stack:
            if nums not in arr:
                fin.append(nums)
                break
        return fin

            
        