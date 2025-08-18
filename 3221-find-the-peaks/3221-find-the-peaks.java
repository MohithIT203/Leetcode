class Solution {
    public List<Integer> findPeaks(int[] mountains) {
        List<Integer> peaks=new ArrayList<>();
        for(int i=1;i<mountains.length-1;i++){
            if(mountains[i]>mountains[i-1] &&mountains[i]>mountains[i+1]){
                peaks.add(i);
            }
        }
        return peaks;
    }
}