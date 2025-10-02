class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch)) count++;
        }
        if(count==word.length() || count==0) return true;
        if(count==1){
            if(Character.isUpperCase(word.charAt(0))) return true;
        }
        return false;
    }
}