class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek()==ch){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        String str="";
        for(char ch:stack) str+=ch; 
        return str;
    }
}