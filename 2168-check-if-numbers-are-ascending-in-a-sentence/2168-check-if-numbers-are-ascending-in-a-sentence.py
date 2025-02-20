class Solution(object):
    def areNumbersAscending(self, s):
        s=s.split()
        li=[]
        for char in s:
            if char.isdigit():
                li.append(int(char))
        min=li[0]
        for i in range(1,len(li)):
            if li[i]<=min:
                return False
            min=li[i]
        return True
