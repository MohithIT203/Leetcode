class Solution(object):
    def sortTheStudents(self, score, k):
        for i in range(len(score)):
            for j in range(i,len(score)):
                if(score[i][k]<score[j][k]):
                    temp=score[i]
                    score[i]=score[j]
                    score[j]=temp
                
            
        
        return score
        