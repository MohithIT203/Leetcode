class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0,left=0,right=k-1;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') white++;
        }
        int min=white;
        left++;
        right++;
        while(left<blocks.length() && right<blocks.length()){
            if(blocks.charAt(left-1)=='W') white--;
            if(blocks.charAt(right)=='W') white++;
            left++;
            right++;
            min=Math.min(min,white);
        }
        return min;
    }
}