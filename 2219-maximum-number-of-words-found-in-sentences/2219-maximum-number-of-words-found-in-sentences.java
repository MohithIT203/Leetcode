class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String ch:sentences){
            max=Math.max(ch.split(" ").length,max);
        }
        return max;
    }
}