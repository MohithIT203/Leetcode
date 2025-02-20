class Solution(object):
    def splitWordsBySeparator(self, words, separator):
        li=[]
        temp=[]
        for i in range(len(words)):
            temp=words[i].split(separator)
            li.extend(temp)
        return filter(None,li)
        