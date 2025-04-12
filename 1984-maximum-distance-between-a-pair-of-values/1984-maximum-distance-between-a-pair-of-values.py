class Solution(object):
    def maxDistance(self, nums1, nums2):
        max_dist=0
        left1=0
        left2=0
        while(left1<len(nums1) and left2<len(nums2)):
            if(nums1[left1]<=nums2[left2] and left1<=left2):
                max_dist=max(left2-left1,max_dist)
                left2+=1
            else:
                left1+=1
                left2+=1
        return max_dist
