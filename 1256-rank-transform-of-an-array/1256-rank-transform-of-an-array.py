class Solution(object):
    def arrayRankTransform(self, arr):
        rank={}
        sortedrank=sorted(set(arr))
        temp_rank=1
        for num in sortedrank:
            rank[num]=temp_rank
            temp_rank+=1
        return [rank[num] for num in arr]
        
        