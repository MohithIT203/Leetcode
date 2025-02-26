class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if( arr.length==1){
            return 1;
        }
        int max=0,flag=0,count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1] && flag==0){
                count+=1;
                flag=1;
            }
            else if(arr[i]>arr[i-1] && flag==1){
                count+=1;
                flag=0;
            }
            else{
                max=Math.max(max,count);
                count=(arr[i]==arr[i-1])?1:2;
                flag = (arr[i] > arr[i - 1]) ? 0 : 1;
            }
        }
         return Math.max(count,max);
    }
   
}