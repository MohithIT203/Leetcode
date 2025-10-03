class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            StringBuilder temp = new StringBuilder(word);
            sb.append(temp.reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}