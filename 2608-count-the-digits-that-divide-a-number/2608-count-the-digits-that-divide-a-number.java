class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(temp>0){
            int res=temp%10;
            if(res!=0 && num%res==0)count++;
            temp/=10;
        }
        return count;
    }
}