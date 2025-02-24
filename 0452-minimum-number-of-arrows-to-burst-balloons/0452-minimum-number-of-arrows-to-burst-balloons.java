class Solution {
    public int findMinArrowShots(int[][] points) {
        // for (int i = 0; i < points.length; i++) {
        //     for (int j = i; j < points.length; j++) {
        //         if (points[i][1] > points[j][1] && i != j) {
        //             int[] temp = points[i];
        //             points[i] = points[j];
        //             points[j] = temp;
        //         }

        //     }
        // }

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int count=1;
        int arrowPos = points[0][1]; 

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > arrowPos) {
                count++;
                arrowPos = points[i][1];
            }
        }
        if (count!=0){
            return count;
        }
        return points.length;
    }
    
}