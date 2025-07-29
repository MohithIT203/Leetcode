class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0,sum=0;
        while(i>=0 ||j>=0||carry!=0){
            int n1=(i>=0)?a.charAt(i--)-'0':0;
            int n2=(j>=0)?b.charAt(j--)-'0':0;
            if(n1==1 && n2==1){
                sum=10+carry;
                carry=sum/10;
                str.append(sum%10);
            }
            else if((n1==1 && n2!=1)||(n1!=1 && n2==1)){
                if(carry==1){
                    sum=10;
                    carry=sum/10;
                    str.append(sum%10);
                }
                else{
                    carry=0;
                    str.append(1);
                }
            }
            else if(n1==0 && n2==0){
                if(carry==1){
                    carry=0;
                    str.append(1);
                }
                else{
                    str.append(0);
                }
            }
        }
        return str.reverse().toString();
    }

}