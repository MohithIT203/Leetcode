class Solution(object):
    def numOfSubarrays(self, arr):
        odd_count = 0
        even_count = 1
        result = 0
        prefix_sum = 0
        
        for num in arr:
            prefix_sum += num
            if prefix_sum % 2 == 0:
                result += odd_count
                even_count += 1
            else:
                result += even_count 
                odd_count += 1
            
        return result%1000000007
