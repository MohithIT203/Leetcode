class Solution {
    public String reversePrefix(String word, char ch) {
        int temp=0;
        int i=0,j=0;
        char []str=word.toCharArray();
        while(i<=j && j<=str.length-1){
            if(str[j]==ch || temp==1){
                char t=str[i];
                str[i]=str[j];
                str[j]=t;
                temp=1;
                i++;
                j--;
            }
            else if(temp==0){
                j++;
            }
        }
        String fin=new String(str);
        return fin;
    }
}