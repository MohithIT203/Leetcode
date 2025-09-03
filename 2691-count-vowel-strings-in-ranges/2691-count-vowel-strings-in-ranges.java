class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix = new int[words.length + 1];
        int[] fin = new int[queries.length];
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            boolean starts = "aeiou".contains(s.substring(0, 1));
            boolean ends   = "aeiou".contains(String.valueOf(s.charAt(s.length() - 1)));
            prefix[i + 1] = prefix[i] + ((starts && ends) ? 1 : 0);
        }

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            fin[i] = prefix[r + 1] - prefix[l];
        }
        return fin;
    }
}