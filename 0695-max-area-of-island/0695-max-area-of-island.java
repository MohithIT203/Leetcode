class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int count=helper(grid,i,j);
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public int helper(int[][] grid,int i,int j){
        if(i<0 ||i>=grid.length || j<0 ||j>=grid[0].length ||grid[i][j]!=1) {
            return 0;
        }
        grid[i][j]=0;
        int area=1;
        area+=helper(grid,i+1,j);
        area+=helper(grid,i-1,j);
        area+=helper(grid,i,j+1);
        area+=helper(grid,i,j-1);
        return area;
    }
}