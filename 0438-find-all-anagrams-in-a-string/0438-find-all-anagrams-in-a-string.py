class Solution(object):
    def findAnagrams(self, s, p):
        IndexList = []
        if len(s)<len(p):
            return []
        freq1=[0]*26
        freq2=[0]*26
        right=0
        left=0
        while(right<len(p)):
            freq1[ord(p[right])-ord('a')]+=1
            freq2[ord(s[right])-ord('a')]+=1
            right+=1
        right-=1
        while(right<len(s)):
            if freq1==freq2:
                IndexList.append(left)
            right+=1
            if right<len(s):
                freq2[ord(s[right])-ord('a')]+=1
            freq2[ord(s[left])-ord('a')]-=1
            left+=1
        return IndexList

        
