class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        if max(hours)<target:
            return 0
        count=0
        for num in hours:
            if num>=target:
                count+=1
        return count

        