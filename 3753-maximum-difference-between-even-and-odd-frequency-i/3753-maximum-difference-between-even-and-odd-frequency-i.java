class Solution {
    public int maxDifference(String s) {
        int [] freq=new int [26];
        for(int i=0;i<s.length();i++){
            freq[(s.charAt(i))-'a']++;
        }
        int maxi=0,mini=s.length();
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                maxi=Math.max(maxi,freq[i]);
            }
            if(freq[i]%2==0 && freq[i]>0){
                mini=Math.min(mini,freq[i]);
            }

        }
        return maxi-mini;
    }
}