class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int k=0;
        for(int i=0;i<image.length;i++){
            reverse(image[i]);
            invert(image[i]);
            
        }
        return image;
    }
    public static void reverse(int[]image){
        int left=0,right=image.length-1;
        while(left<right){
            int t=image[left];
            image[left]=image[right];
            image[right]=t;
            left++;
            right--;
        }
    }
    public static void invert(int[] image) {
        for (int i = 0; i < image.length; i++) {
            image[i] = image[i] == 0 ? 1 : 0;
        }
    }
    }
