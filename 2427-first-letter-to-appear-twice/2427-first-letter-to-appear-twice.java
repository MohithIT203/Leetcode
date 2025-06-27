class Solution {
    public char repeatedCharacter(String s) {
        Set <Character> str=new HashSet<>();
        char c=s.charAt(0);
        for(char ch:s.toCharArray()){
            if(str.contains(ch)){
                c=ch;
                break;
            }
            str.add(ch);
        }
        return c;

    }
}