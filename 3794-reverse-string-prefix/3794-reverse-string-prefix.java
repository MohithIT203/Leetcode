class Solution {
    public String reversePrefix(String s, int k) {
        char str[] = s.toCharArray();
        int i=0;
        k--;
        while(i<k){
            char temp=str[i];
            str[i]=str[k];
            str[k]=temp;
            i++;
            k--;
        }
        return String.valueOf(str);
    }
}