class Solution(object):
    def mergeAlternately(self, word1, word2):
        fin = []
        i, j = 0, 0
        len1, len2 = len(word1), len(word2)

        while i < len1 or j < len2:
            if i < len1:
                fin.append(word1[i])
                i += 1
            if j < len2:
                fin.append(word2[j])
                j += 1

        return "".join(fin)
