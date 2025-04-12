class Solution(object):
    def minimumCost(self, cost):
        if len(cost)>=2:
            cost.sort(reverse=True)
            amount=0
            k=0
            for i in range(len(cost)):
                if k!=2:
                    amount+=cost[i]
                    k+=1
                else:
                    k=0
                    continue
            return amount
        return cost[0]