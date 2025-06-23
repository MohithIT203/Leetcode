class Solution {
    public int minBitFlips(int start, int goal) {
        int fin=start^goal,count=0;
        while(fin!=0){
		    fin=(fin &(fin-1));
		    count++;
		}
        return count;
    }
}