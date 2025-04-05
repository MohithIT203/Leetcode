class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        count_dict={}
        fin=[]
        for num in arr2:
            if num in arr1:
                count_dict[num]=arr1.count(num)
            else:
                count_dict[num]=-1
        i=0
        while(i<len(arr2)):
            if count_dict[arr2[i]]!=0:
                fin.append(arr2[i])
                count_dict[arr2[i]]-=1
            else:
                i+=1
        sorted_arr1=sorted(arr1)
        for num in sorted_arr1:
            if num not in arr2:
                fin.append(num)
        return fin

        