class Solution(object):
    def findMissingAndRepeatedValues(self, grid):
        length=len(grid)*len(grid)+1
        arr=[]
        repeatstack=[]
        fin=[]
        for i,num in enumerate(grid):
            arr.extend(num)
        for i in range(len(arr)):
            if arr[i] in repeatstack:
                fin.append(arr[i])
            repeatstack.append(arr[i])
        arr=set(arr)
        for i in range(1,length):
            if i not in arr:
                fin.append(i)
                break
        return fin

            
        