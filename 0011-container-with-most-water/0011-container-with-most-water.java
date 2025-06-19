class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,area=0,min=height[0];
        while(start<end){
            min=Math.min(height[start],height[end]);
            area=Math.max(area,(min*(end-start)));
            if(height[start]<height[end]){
                start++;
            }
            else{
                 end--;
            }
        }
        return area;
    }
}