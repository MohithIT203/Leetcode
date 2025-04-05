class Solution(object):
    def countTestedDevices(self, batteryPercentages):
        count=0
        length=len(batteryPercentages)
        for i in range(length):
            if batteryPercentages[i]>0:
                start=i+1
                end=length
                while (start<end):
                    if(batteryPercentages[start]>0):
                        batteryPercentages[start]-=1
                    start+=1
                count+=1
            elif batteryPercentages[i]==0:
                continue
        return count