class Solution {
    public int[] separateDigits(int[] nums) {
        int length=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num!=0){
                length++;
                num/=10;
            }
        }
        int arr[]=new int[length];
        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            while(num!=0){
                arr[--length]=num%10;
                num/=10;
            }
        }
        
        return arr;
    }
}