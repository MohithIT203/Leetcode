class Solution(object):
    def kItemsWithMaximumSum(self, numOnes, numZeros, numNegOnes, k):
        sums=0
        while(numOnes!=0 and k!=0):
            sums+=1
            numOnes-=1
            k-=1
        
        while(numZeros!=0 and k!=0):
            numZeros-=1
            k-=1
        while(numNegOnes!=0 and k!=0):
            numNegOnes-=1
            k-=1
            sums-=1
        return sums
        
        

        