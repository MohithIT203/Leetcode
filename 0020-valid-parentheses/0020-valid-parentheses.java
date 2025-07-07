class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else {
               if(stack.isEmpty()) return false;
                char temp = stack.pop();
                if ((ch == ')' && temp != '(') || (ch == '}' && temp != '{') || (ch == ']' && temp != '[')) {
                    return false; 
                }
               
        }
        }
        return stack.isEmpty();
    }
}