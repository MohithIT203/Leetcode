class Solution(object):
    def pivotArray(self, nums, pivot):
        # li1=[]
        # li2=[]
        # count=0
        # for num in nums:
        #     if num<pivot:
        #         li1.append(num)
        #     elif num>pivot:
        #         li2.append(num)
        #     else:
        #         count+=1
        # while(count!=0):
        #     li1.append(pivot)
        #     count-=1
        # li1.extend(li2)
        # return li1


        left = [num for num in nums if num < pivot]
        mid = [num for num in nums if num == pivot]
        right = [num for num in nums if num > pivot]
        return left + mid + right