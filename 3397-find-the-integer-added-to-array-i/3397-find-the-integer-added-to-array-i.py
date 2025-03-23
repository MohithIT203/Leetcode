class Solution(object):
    def addedInteger(self, nums1, nums2):
        if nums1==nums2:
            return 0
        nums1.sort()
        nums2.sort()
        return nums2[0]-nums1[0]
        