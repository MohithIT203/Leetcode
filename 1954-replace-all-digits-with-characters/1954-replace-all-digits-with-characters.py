class Solution(object):
    def replaceDigits(self, s):
        li=[]
        temp=s[0]
        li.append(temp)
        for i in range(1,len(s)):
            if i%2!=0:
                n=ord(temp)+int(s[i])
                n=chr(n)
                li.append(n)
            else:
                temp=s[i]
                li.append(temp)
        return "".join(li)
                