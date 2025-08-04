class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int i=0;
        while (i <= s.length() - 3) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && b != c && a != c) {
                count++;
            }
            a=b;
            b=c;
            i++;
        }

        return count;
    }
}
