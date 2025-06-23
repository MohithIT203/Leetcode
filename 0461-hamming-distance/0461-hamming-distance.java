class Solution {
    public int hammingDistance(int x, int y) {
         int count=0,n=x^y;
		while(n!=0){
		    n=(n &(n-1));
		    count++;
		}
        return count;
    }
}