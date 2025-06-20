class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int max=0;
        int vowel=0;
        for(int i=0;i<26;i++){
            if(i!=0 && i!=4 &&i!=14 &&i!=8 &&i!=20){
                max=Math.max(max,freq[i]);
            }
            else{
                vowel=Math.max(vowel,freq[i]);
            }   
        }
        return max+vowel;
    }
}