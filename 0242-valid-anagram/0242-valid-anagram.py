class Solution(object):
    def isAnagram(self, s, t):
        # return sorted(s)==sorted(t)

        if len(s)!=len(t):
            return False
        freq1=[0]*26
        freq2=[0]*26
        index=0
        while(index<len(s)):
            freq1[ord(s[index])-ord('a')]+=1
            freq2[ord(t[index])-ord('a')]+=1
            index+=1
        return freq1==freq2