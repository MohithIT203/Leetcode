class Solution(object):
    def minimumAbsDifference(self, arr):
        arr.sort()
        final_list=[]
        min_sum=float('inf')
        for i in range(1,len(arr)):
            min_sum=min(min_sum,arr[i]-arr[i-1])
        print(min_sum)
        for i in range(len(arr)-1):
            if arr[i+1]-arr[i]==min_sum:
                final_list.append([arr[i],arr[i+1]])
        return final_list
        