class Solution {
    public int uniquePaths(int m, int n) {
      int arr[][]=new int[m+1][n+1];
		for(int i=0;i<m;i++){
		    arr[i][0]=1;
		}
		for(int i=0;i<n;i++){
		    arr[0][i]=1;
		}
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
		// helper(arr,1,1,m,n);
        return arr[m-1][n-1];
    }
    // public void helper(int[][] arr,int i,int j,int m,int n){
    //     if(i>m||j>n) return;
    //     arr[i][j]=arr[i-1][j]+arr[i][j-1];
    //     helper(arr,i,j+1,m,n);
    //     helper(arr,i+1,j,m,n);
    // }
}