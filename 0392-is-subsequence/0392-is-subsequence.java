class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            char t1 = s.charAt(i);
            char t2 = t.charAt(j);
            if (t1 == t2) {
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}