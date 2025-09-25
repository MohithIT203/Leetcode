class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split(" ");
        int count=0;
        for(String s:str){
            int flag=0;
            for(char ch:brokenLetters.toCharArray()){
                if(s.indexOf(ch)!=-1){
                    flag=1;
                    break;
                }
            }
            if(flag==0)count++;
        }
        return count;
    }
}