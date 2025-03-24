class Solution(object):
    def defangIPaddr(self, address):
        fin=""
        for i in range(len(address)):
            if address[i]==".":
                fin+="[.]"
            else:
                fin+=address[i]
        return fin
        