class Solution(object):
    def dayOfTheWeek(self, day, month, year):
        if month==1:
            month=13
            year=year-1
        elif month==2:
            month=14
            year=year-1
        firsttwo=year//100
        lasttwo=year%100
        daysarr=["Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]
        return daysarr[(((day) +((13*(month+1)//5))+lasttwo+(lasttwo//4)+(firsttwo//4)+(5*firsttwo))%7)]
        