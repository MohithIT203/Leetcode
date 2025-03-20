class Solution(object):
    def mergeAlternately(self, word1, word2):
        fin=""
        count1=len(word1)
        count2=len(word2)
        k1=0
        k2=0
        for i in range(len(word1)+len(word2)):
            if count1<=count2:
                if(i%2==0 and count1!=0):
                    fin+=word1[k1]
                    k1+=1
                    count1-=1
                else:
                    fin+=word2[k2]
                    k2+=1
                    count2-=1
            else:
                if(i%2!=0 and count2!=0):
                    fin+=word2[k2]
                    k2+=1
                    count2-=1
                else:
                    fin+=word1[k1]
                    k1+=1
                    count1-=1
        return fin

        