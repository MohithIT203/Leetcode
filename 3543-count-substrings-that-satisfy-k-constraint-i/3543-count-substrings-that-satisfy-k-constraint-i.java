class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l=0,r=0,zero_count=0,one_count=0;
        int tot=0;
        while(l!=s.length() && r!=s.length()){
            char ch=s.charAt(r);
            if(ch=='0'){
                zero_count++;
            }
            else{
                one_count++;
            }
            while(zero_count>k && one_count>k){
                if(s.charAt(l)=='0'){
                 zero_count--;
                }
                else{
                 one_count--;
                }
                l++;
            }
            tot+=(r-l+1);
            r++;
        }
        return tot;
    }
}