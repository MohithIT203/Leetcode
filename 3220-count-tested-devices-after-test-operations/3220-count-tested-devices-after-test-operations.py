class Solution(object):
    def countTestedDevices(self, batteryPercentages):
        count = 0
        for battery in batteryPercentages:
            if battery > count:
                count += 1
        return count
