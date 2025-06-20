class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length();
        for(int i=0;i<=n-m;i++){
            String str=haystack.substring(i,m+i);
           if(str.equals(needle)){
            return i;
           }
        }
        return -1;
        
    }
}