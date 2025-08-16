class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
         StringBuilder sb = new StringBuilder();
        int i=0,t=0;
        while(i!=str.length()){
            int n=str.charAt(i)-'0';
            if(n!=9 && t==0){
                sb.append("9");
                t=1;

            }
            else{
                sb.append(Integer.toString(n));
            }
            i++;
        }
        return Integer.parseInt(sb.toString());
    }
}