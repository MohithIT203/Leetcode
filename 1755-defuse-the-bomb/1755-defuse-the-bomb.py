class Solution(object):
    def decrypt(self, code, k):
        sum_arr=[]
        sums=0
        flag=False
        if(k<0):
            flag=True
            temp=abs(k)
        for i in range(1,len(code)+1):
            sums=0
            temp=abs(k)
            while(temp>0):
                if(flag):
                    sums+=code[(len(code)-1)-(i%len(code))]
                else:
                    sums+=code[i%len(code)]
                i+=1
                temp-=1
            print(sums)
            sum_arr.append(sums)
        if(flag):
            return sum_arr[::-1]
        return sum_arr
        