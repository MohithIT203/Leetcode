class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        for (char ch : words[0].toCharArray()) {
            minFreq[ch - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] freq = new int[26];
            for (char c : words[i].toCharArray()) {
                freq[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i]-- > 0) {
                result.add(String.valueOf((char)(i + 'a')));
            }
        }

        return result;
    }
}