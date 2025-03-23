class Solution(object):
    def sortPeople(self, names, heights):
        Dict = {}
        temp = []
        for i in range(len(names)):
            Dict[heights[i]] = names[i]
        for i in sorted(Dict):
            temp.append(Dict.get(i))
        return temp[::-1]
