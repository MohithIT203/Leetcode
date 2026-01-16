class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freqT=new int[26];
        int[] freqB=new int[26];
        for(char ch:text.toCharArray()){
            freqT[ch-'a']++;
        }
        for(char ch:"balloon".toCharArray()){
            freqB[ch-'a']++;
        }
        int balloons=Integer.MAX_VALUE;
        for(char ch:"balloon".toCharArray()){
            balloons=Math.min(balloons,freqT[ch-'a']/freqB[ch-'a']);
        }
        return balloons;
    }
}