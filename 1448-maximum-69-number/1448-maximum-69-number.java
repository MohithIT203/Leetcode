class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        String fin="";
        int i=0,t=0;
        while(i!=str.length()){
            int n=str.charAt(i)-'0';
            if(n!=9 && t==0){
                fin+="9";
                t=1;

            }
            else{
                fin+=Integer.toString(n);
            }
            i++;
        }
        return Integer.parseInt(fin);
    }
}