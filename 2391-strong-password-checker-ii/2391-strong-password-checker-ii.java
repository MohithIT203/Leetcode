class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        int lower=0,upper=0,digit=0,spl=0;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(i<password.length()-1 && ch==password.charAt(i+1)) return false;
            if(Character.isUpperCase(ch)) upper=1;
            else if(Character.isLowerCase(ch)) lower=1;
            else if(Character.isDigit(ch)) digit=1;
            else spl=1;
            
        }
            if(upper==1 && lower==1 && digit==1 && spl==1) return true;
        return false;
    }
}