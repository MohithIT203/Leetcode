class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        for(String st:word1){
            str1+=st;
        }
        for(String st:word2){
            str2+=st;
        }
        return str1.equals(str2);
    }
}