class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String n=Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(Character.toString(n.charAt(i)));
        }
        int i=k;
        int divisor=0;
        while(i<n.length()){
            divisor=Integer.parseInt(sb.toString());
            if(divisor!=0 && num%divisor==0){
                count++;
            }
            sb.deleteCharAt(0);
            sb.append(Character.toString(n.charAt(i)));
            i++;
        }
            divisor=Integer.parseInt(sb.toString());
            if(divisor!=0 && num%divisor==0){
                count++;
            }
        return count;
    }
}