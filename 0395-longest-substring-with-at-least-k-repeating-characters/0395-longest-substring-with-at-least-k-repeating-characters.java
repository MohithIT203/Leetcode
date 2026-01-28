class Solution {
    int helper(String s,int k){
        if(s.length()<k) return 0;

        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        //divide and conquer
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']<k){
                int left = helper(s.substring(0,i),k);
                int right = helper(s.substring(i+1),k);
                return Math.max(left,right);
            }
        }
        return s.length();
    }
    public int longestSubstring(String s, int k) {
        return helper(s,k);
    }

}