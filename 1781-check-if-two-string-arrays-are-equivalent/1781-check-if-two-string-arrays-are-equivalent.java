class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(String st:word1){
            str1.append(st);
        }
        for(String st:word2){
            str2.append(st);
        }
        return str1.toString().equals(str2.toString());
    }
}