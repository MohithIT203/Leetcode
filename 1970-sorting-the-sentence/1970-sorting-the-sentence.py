class Solution(object):
    def sortSentence(self, s):
        s=s.split()
        li=[None]*len(s)
        for char in s:
            num=int(char[-1])
            string=char[:len(char)-1]
            li[num-1]=string
        return " ".join(li) 
        
