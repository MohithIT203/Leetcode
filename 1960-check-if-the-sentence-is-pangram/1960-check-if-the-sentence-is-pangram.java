class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[]=new boolean[26];
        for(char ch:sentence.toCharArray()){
            arr[ch-'a']=true;
        }
        for(int i=0;i<26;i++){
            if(!arr[i]) return false;
        }
        return true;
    }
}