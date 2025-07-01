class Solution {
    public void duplicateZeros(int[] arr) {
        int[]temp=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length && k<arr.length;i++){
            if(arr[i]==0){
                temp[k++]=0;
                if(k<arr.length)
                temp[k++]=0;
            }
            else{
            temp[k++]=arr[i];
            }
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
}