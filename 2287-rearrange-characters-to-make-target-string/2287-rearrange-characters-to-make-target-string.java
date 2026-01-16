class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int words=Integer.MAX_VALUE;
        for(char ch:s.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            freq2[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            words=Math.min(words,freq1[ch-'a']/freq2[ch-'a']);
        }
        return words;
    }
}