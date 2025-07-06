class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char str : s.toCharArray()) {
            if (str == '(') {
                stack.push(str);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(str);
                }
            }
        }
        return stack.size();
    }
}