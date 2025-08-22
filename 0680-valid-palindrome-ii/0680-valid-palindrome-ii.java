class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                if(palindrome(start+1,end,s)||palindrome(start,end-1,s)){
                    return true;
                }
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public boolean palindrome(int start,int end,String s){
        while (start < end) {
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
               return false;
            }
            start++;
            end--;
    }
    return true;
    }
}
