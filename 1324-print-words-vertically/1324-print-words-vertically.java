class Solution {
    public List<String> printVertically(String s) {
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> vertical = new ArrayList<>();
        String[] words = s.split(" ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            max = Math.max(max, words[i].length());
        }
        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                } else {
                    sb.append(' ');
                }
            }
            //Remove trailing space\
            int len=sb.length()-1;
            while(len>=0 && sb.charAt(len)==' '){
                sb.deleteCharAt(len);
                len--;
            }
            vertical.add(sb.toString());
        }

        return vertical;
    }
}