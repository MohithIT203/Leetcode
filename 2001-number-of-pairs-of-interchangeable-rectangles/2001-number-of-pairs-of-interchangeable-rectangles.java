class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long res=0;
        Map<Double,Integer> map=new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            double pair=(double)rectangles[i][0]/rectangles[i][1];
            int count = map.getOrDefault(pair, 0);
            res += count;  // all previous rectangles with this ratio form pairs
            map.put(pair, count + 1);
        }
        return res;
       
    }
}