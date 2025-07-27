class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int orgColor=image[sr][sc];
        horizontal(image,sr,sc,color,orgColor);
        return image;
    }
    public void horizontal(int[][] image,int r,int c,int color,int ogColor){ 
      if(r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;
       if(image[r][c]!=ogColor) return;
      image[r][c]=color;
      //check in all directions
      horizontal(image,r,c+1,color,ogColor);
      horizontal(image,r,c-1,color,ogColor);
      horizontal(image,r+1,c,color,ogColor);
      horizontal(image,r-1,c,color,ogColor);
      
    }
}