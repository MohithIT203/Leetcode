class Solution(object):
    def splitWordsBySeparator(self, words, separator):
        li=[]
        temp=[]
        for i in range(len(words)):
            temp=words[i].split(separator)
            for j in range(len(temp)):
                if temp[j]!='':
                    li.append(temp[j])
        return li
        