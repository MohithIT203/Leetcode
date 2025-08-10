class Solution {
    public boolean isFascinating(int n) {
        String num=Integer.toString(n)+Integer.toString(2*n)+Integer.toString(3*n);
        boolean arr[]=new boolean[10];
        for(char ch:num.toCharArray()){
            if(ch-'0'==0 || arr[ch-'0']){
                return false;
            }
            else{
                arr[ch-'0']=true;
            }
        }
        return true;
    }
}