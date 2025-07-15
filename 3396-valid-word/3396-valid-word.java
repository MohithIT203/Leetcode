class Solution {
    public boolean isValid(String word) {
        int vowel=0,cons=0;
        if(word.length()<3) return false;
       for(char ch:word.toCharArray()){
        if(Character.isDigit(ch)) continue;
        if(Character.isLetter(ch)){
        if ("aeiouAEIOU".contains(String.valueOf(ch))){
            vowel++;
        }
        else{
            cons++;
        }
       }
       else{
        return false;
       }
    }
    return vowel>0  && cons>0;   
}
}