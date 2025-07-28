class Solution {
    public int minPathSum(int[][] grid) {
        int temp=grid[0][0];
        //DP bottom-up approach
        for(int i=1;i<grid.length;i++){
            grid[i][0]=temp+grid[i][0];
            temp=grid[i][0];
        }
        temp=grid[0][0];
        for(int i=1;i<grid[0].length;i++){
            grid[0][i]=temp+grid[0][i];
            temp=grid[0][i];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j]=grid[i][j]+Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}