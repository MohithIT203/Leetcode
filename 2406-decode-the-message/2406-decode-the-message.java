class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        char t='a';
        for(char ch:key.toCharArray()){
            if(!map.containsKey(ch)&& !Character.isWhitespace(ch)){
                map.put(ch,t++);
            }
        }
        for(char ch:message.toCharArray()){
            if(Character.isWhitespace(ch)){
                sb.append(" ");
            }
            else{
                sb.append(String.valueOf(map.get(ch)));
            }
        }
        return sb.toString();
    }
}