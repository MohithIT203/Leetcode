class Solution {
    public int findJudge(int n, int[][] trust) {
        int judge[]=new int[n+1];
        for(int[] a:trust){
            judge[a[0]]--;
            judge[a[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(judge[i]==(n-1)){ //Everybody (except for the town judge) trusts the town judge. 
                return i;
            }
        }
        return -1;
    }
}