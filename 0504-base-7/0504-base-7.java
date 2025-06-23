class Solution {
    public String convertToBase7(int num) {
        String s="";
        int flag=0;
        if(num==0){
            return "0";
        }
        if(num<0){
            flag=1;
            num=Math.abs(num);
        }
        while(num!=0){
            s=num%7+s;
            num/=7;
        }
        if(flag==1){
            return s="-"+s;
        }
        return s;
    }
}