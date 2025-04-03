class Solution(object):
    def maximumTripletValue(self, nums):
        max_i = 0 
        max_diff = float('-inf') 
        max_triplet = 0  
        for num in nums:
            max_triplet = max(max_triplet, max_diff * num)
            max_diff = max(max_diff, max_i - num)
            max_i = max(max_i, num)
        
        return max_triplet
