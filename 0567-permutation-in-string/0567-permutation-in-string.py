class Solution(object):
    def checkInclusion(self, s1, s2):

        # Sliding Window

        if len(s2)<len(s1):
            return False
        freq1=[0]*26
        freq2=[0]*26
        right=0
        left=0
        while(right<len(s1)):
            freq1[ord(s1[right])-ord('a')]+=1
            freq2[ord(s2[right])-ord('a')]+=1
            right+=1
        right-=1
        while(right<len(s2)):
            if freq1==freq2:
                return True
            right+=1
            if right!=len(s2):
                freq2[ord(s2[right])-ord('a')]+=1
            freq2[ord(s2[left])-ord('a')]-=1
            left+=1
        return False

        