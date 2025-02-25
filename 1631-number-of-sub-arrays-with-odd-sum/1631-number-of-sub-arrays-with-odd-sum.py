class Solution(object):
    def numOfSubarrays(self, arr):
        MOD = 1000000007
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
            
            result %= MOD
            
        return result
