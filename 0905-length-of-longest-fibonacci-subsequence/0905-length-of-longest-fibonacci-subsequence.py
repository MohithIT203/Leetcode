class Solution(object):
    def lenLongestFibSubseq(self, arr):
        index_map = {num: i for i, num in enumerate(arr)}
        dp = defaultdict(lambda: 2)  # Default length is at least 2
        max_length = 0
    
        for j in range(len(arr)):
            for i in range(j):
                x = arr[j] - arr[i]
                if x in index_map and index_map[x] < i:
                    k = index_map[x]
                    dp[(i, j)] = dp[(k, i)] + 1
                    max_length = max(max_length, dp[(i, j)])

        return max_length if max_length >= 3 else 0 
        