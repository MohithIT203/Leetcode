class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.matches("-?\\d+")){
                stack.push(Integer.parseInt(token));
            }
            else if(stack.size()>=2 && token.matches("[+\\-*/^]")){
                int n2=stack.pop();
                int n1=stack.pop();
                if(token.equals("+")) stack.push(n1+n2);
                else if(token.equals("-"))stack.push(n1-n2);
                else if(token.equals("*"))stack.push(n1*n2);
                else stack.push((int)n1/n2);
            }
        }
        return stack.peek();
    } 
    
}