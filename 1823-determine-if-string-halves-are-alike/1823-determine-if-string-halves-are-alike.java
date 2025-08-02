class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if("aeiouAEIOU".contains(Character.toString(ch))){
                if(i<s.length()/2)
                count++;
                else
                count--;
            }
        }
        return count==0;
    }
}