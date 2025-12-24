class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total=0;
        for(int i=0;i<apple.length;i++){
            total+=apple[i];
        }
        int count=1;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            total-=capacity[i];
            if(total<=0){
                break;
            }
            count++;
        }
        return count;
    }
}