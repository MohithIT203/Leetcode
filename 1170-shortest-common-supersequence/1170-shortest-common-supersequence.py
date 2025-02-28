class Solution(object):
    def shortestCommonSupersequence(self, str1, str2):
        m, n = len(str1), len(str2)
        dp = [[""] * (n + 1) for _ in range(m + 1)]

        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if str1[i - 1] == str2[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1] + str1[i - 1]
                else:
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1], key=len)

        i, j = 0, 0
        lcs = dp[m][n]
        result = []

        for c in lcs:
            while i < m and str1[i] != c:
                result.append(str1[i])
                i += 1
            while j < n and str2[j] != c:
                result.append(str2[j])
                j += 1
            result.append(c)
            i += 1
            j += 1

        result.append(str1[i:])
        result.append(str2[j:])

        return "".join(result)

        