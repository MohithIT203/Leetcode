class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        String bin="";
        int comp = 0;
        while(n!=0){
            bin=(n%2)+bin;
            n/=2;

        }
        int temp =0;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='0'){
                comp+=(1<<temp);
            }
            temp++;
        }
        return comp;
    }
}