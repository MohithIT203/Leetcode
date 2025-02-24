class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        if not intervals:
            return 0

        intervals.sort(key=lambda x: x[1])

        count = 0
        prev_end = float('-inf')

        for start, end in intervals:
            if start >= prev_end:
                prev_end = end
            else: 
                count += 1

        return count
