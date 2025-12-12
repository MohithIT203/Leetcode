class Solution {
    //recursion - TLE error
    int lcs_rec(String text1, int ind1, String text2, int ind2) {
        if (ind1 == text1.length() || ind2 == text2.length())
            return 0;

        int lcs_len = 0;
        if (text1.charAt(ind1) == text2.charAt(ind2)) {
            lcs_len = 1 + lcs_rec(text1, ind1 + 1, text2, ind2 + 1);
        } else {
            int l1 = lcs_rec(text1, ind1 + 1, text2, ind2);
            int l2 = lcs_rec(text1, ind1, text2, ind2 + 1);
            lcs_len = Math.max(l1, l2);
        }
        return lcs_len;
    }

    // dp-memoization
    int lcs_memo(String text1, int ind1, String text2, int ind2, int[][] memo) {
        if (ind1 == text1.length() || ind2 == text2.length())
            return 0;

        int lcs_len = 0;
        if (memo[ind1][ind2] != -1)
            return memo[ind1][ind2];
        if (text1.charAt(ind1) == text2.charAt(ind2)) {
            lcs_len = 1 + lcs_memo(text1, ind1 + 1, text2, ind2 + 1, memo);
        } else {
            int l1 = lcs_memo(text1, ind1 + 1, text2, ind2, memo);
            int l2 = lcs_memo(text1, ind1, text2, ind2 + 1, memo);
            lcs_len = Math.max(l1, l2);
        }
        return memo[ind1][ind2] = lcs_len;
    }

    int lcs_wrapper(String str1, String str2) { //wrapper
        // lcs_rec(text1,0,text2,0);//recursion
        int[][] memo = new int[str1.length()][str2.length()];
        for (int row = 0; row < str1.length(); row++) {
            Arrays.fill(memo[row], -1);
        }
        return lcs_memo(str1, 0, str2, 0, memo);

        //dp-tabulation
        // int[][] tab = new int[str1.length() + 1][str2.length() + 1];
        // int row, col;
        // for (row = str1.length(), col = 0; col <= str2.length(); col++)
        //     tab[row][col] = 0;
        // for (col = str2.length(), row = 0; row <= str1.length(); row++)
        //     tab[row][col] = 0;
        // int ind1;
        // int ind2;
        // for (ind1 = str1.length() - 1; ind1 >= 0; ind1--) {
        //     for (ind2 = str2.length() - 1; ind2 >= 0; ind2--) {
        //         int lcs_len = 0;
        //         if (str1.charAt(ind1) == str2.charAt(ind2))//equal
        //             lcs_len = 1 + tab[ind1 + 1][ind2 + 1];
        //         else {
        //             int ch1 = tab[ind1 + 1][ind2];
        //             int ch2 = tab[ind1][ind2 + 1];
        //             lcs_len = Math.max(ch1, ch2);
        //         }
        //         tab[ind1][ind2] = lcs_len;
        //     }
        // }
        // return tab[0][0];

    }

    public int longestCommonSubsequence(String text1, String text2) {
        return lcs_wrapper(text1, text2);
    }
}