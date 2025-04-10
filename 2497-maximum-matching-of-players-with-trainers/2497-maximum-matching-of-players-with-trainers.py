class Solution(object):
    def matchPlayersAndTrainers(self, players, trainers):
        players.sort()
        trainers.sort()
        start1=0
        start2=0
        count=0
        while(start1<len(players) and start2<len(trainers)):
            if(players[start1]<=trainers[start2]):
                start1+=1
                start2+=1
                count+=1
            else:
                start2+=1
        return count
        