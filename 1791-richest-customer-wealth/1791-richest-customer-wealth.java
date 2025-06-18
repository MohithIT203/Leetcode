class Solution {
    public int maximumWealth(int[][] accounts) {
        int i=0,n=accounts.length,max=0;
        while(i<=n-1){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
            i++;
        }
        return max;
    }
}