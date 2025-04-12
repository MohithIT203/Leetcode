class Solution(object):
    def finalValueAfterOperations(self, operations):
        num=0
        for i in range(len(operations)):
            if operations[i]=="--X" or operations[i]=='X--':
                num-=1
            elif operations[i]=="++X" or operations[i]=='X++':
                num+=1
        return num