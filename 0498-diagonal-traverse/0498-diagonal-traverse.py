class Solution(object):
    def findDiagonalOrder(self, mat):
        row,col=0,0
        m=len(mat)
        n=len(mat[0])
        flag=1
        final_list=[]
        for i in range(m*n):
            final_list.append(mat[row][col])
            if(flag):
                if(col==n-1):
                    row+=1
                    flag=0
                elif(row==0):
                    col+=1
                    flag=0
                else:
                    row-=1
                    col+=1
            else:
                if(row==m-1):
                    col+=1
                    flag=1
                elif(col==0):
                    row+=1
                    flag=1
                
                else:
                    row+=1
                    col-=1
        return final_list            


        