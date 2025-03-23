class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        count=0
        for num in hours:
            if num>=target:
                count+=1
        return count

        