class Solution {
    public String toLowerCase(String s) {
        char []str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            int ascii=(int)str[i];
            if(ascii>=65 && ascii<=90){
                str[i]=(char)(ascii+32);
                
            }
        }
        return new String(str);
    }
}