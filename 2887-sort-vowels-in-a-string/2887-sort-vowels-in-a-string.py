class Solution(object):
    def sortVowels(self, s):
        li=list(s)
        vowels=[]
        for i in range(len(s)):
            if s[i] in "aeiouAEIOU":
                vowels.append(s[i])
        vowels.sort(reverse=True)
        for i in range(len(s)):
            if s[i] in "aeiouAEIOU":
                li[i]=vowels.pop()
        return "".join(li)        