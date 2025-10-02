class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split("\\s+");
        StringBuilder fin= new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
                if(word.length()<=2){
                    fin.append(word.toLowerCase());
                }
                else{
                fin.append(Character.toUpperCase(word.charAt(0)));
                fin.append(word.substring(1).toLowerCase());
                }
                if(i<words.length-1) fin.append(" ");
            }
        
        return fin.toString();
    }
}