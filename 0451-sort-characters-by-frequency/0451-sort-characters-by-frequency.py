class Solution(object):
    def frequencySort(self, s):
        freq=[0]*256
        final_string=[]
        for i in range(len(s)):
            freq[ord(s[i])]+=1
        for i in range(len(s)):
            temp=max(freq)
            index=freq.index(temp)
            if temp==0:
                break
            char=chr(index)
        
            final_string.append(char*temp)
            temp-=1
            freq[index]=0
        return "".join(final_string)
    