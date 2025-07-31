class Solution {
    public int alternateDigitSum(int n) {
        String str=Integer.toString(n);
        int total=0;
        for(int i=0;i<str.length();i+=2){
            total+=str.charAt(i)-'0';
        }
        for(int i=1;i<str.length();i+=2){
            total-=str.charAt(i)-'0';
        }
        return total;
    }
}