class Solution(object):
    def numberOfPairs(self, nums1, nums2, k):
        count=0
        for i in range(len(nums1)):
            for j in range(len(nums2)):
                if nums1[i]%(nums2[j]*k)==0:
                    count+=1
        return count
        